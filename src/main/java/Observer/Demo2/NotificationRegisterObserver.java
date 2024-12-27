package Observer.Demo2;

import Observer.MyEventBus.Subscribe;

public class NotificationRegisterObserver {

    @Subscribe
    void handleRegisterSuccess(Long userId) {
        System.out.println("User registered successfully");
    }
}
