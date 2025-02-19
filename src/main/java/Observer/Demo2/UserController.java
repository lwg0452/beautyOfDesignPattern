package Observer.Demo2;


import Observer.MyEventBus.EventBus;

import java.util.List;

public class UserController {


    private EventBus eventBus;  // 同步阻塞
//    private AsyncEventBus eventBus;  // 异步非阻塞
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 10;

    public UserController() {
//        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
        this.eventBus = new EventBus();
    }

    public void setRegisterObserver(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long registry(String username, String password) {

        // 调用 Service 层方法
        // long userId = userService.registry(username, password);
        Long userId = 11111111L;

        eventBus.post(userId);
        return userId;
    }
}
