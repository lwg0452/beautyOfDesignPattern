package Observer.MyEventBus;

import java.lang.reflect.Method;
import java.util.ArrayList;
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

        // 1. 获取 object 的方法列表
        Method[] methods = observer.getClass().getMethods();
        for (Method method : methods) {
            // 2. 找出标有 @Subscribe 注解的方法
            if (!method.isAnnotationPresent(Subscribe.class)) {
                continue;
            }
            // 3. 获取方法的第一个参数
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length != 1) {
                continue;
            }
            Class<?> type = parameterTypes[0];
            ObserverAction action = new ObserverAction(observer, method);
            // 4. 添加到set
            CopyOnWriteArraySet<ObserverAction> observers = new CopyOnWriteArraySet<>();
            if (registry.containsKey(type)) {
                observers.addAll(registry.get(type));
            }
            observers.add(action);
            registry.put(type, observers);
        }
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
