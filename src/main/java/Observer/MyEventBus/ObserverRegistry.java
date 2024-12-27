package Observer.MyEventBus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class ObserverRegistry {

    ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    public ObserverRegistry() {}

    // 找到 object 中标记了@Subscribe的方法，注册到registry中
    public void register(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> actions = entry.getValue();
            if (!registry.containsKey(eventType)) {
                registry.put(eventType, new CopyOnWriteArraySet<>());
            }
            registry.get(eventType).addAll(actions);
        }
    }

    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new ConcurrentHashMap<>();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            if (!observerActions.containsKey(eventType)) {
                observerActions.put(eventType, new ArrayList<>());
            }
            observerActions.get(eventType).add(new ObserverAction(observer, method));
        }
        return observerActions;
    }

    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (!method.isAnnotationPresent(Subscribe.class)) {
                continue;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            Preconditions.checkArgument(parameterTypes.length == 1,
                    "Method %s has @Subscribe annotation but has %s parameters."
                            + "Subscriber methods must have exactly 1 parameter.");
            annotatedMethods.add(method);
        }
        return annotatedMethods;
    }

    // 移除registry中的
    public void unregister(Object object) {}

    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> matchedObserverActions = new ArrayList<>();
        Class<?> eventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()) {
            Class<?> type = entry.getKey();
            if (eventType.isAssignableFrom(type)) {
                matchedObserverActions.addAll(entry.getValue());
            }
        }
        return matchedObserverActions;
    }
}
