package Observer.Demo2;

import com.google.common.eventbus.Subscribe;

public class NotificationRegisterObserver {

    @Subscribe
    void handleRegisterSuccess(Long userId) {
        System.out.println("User registered successfully");
    }
}
