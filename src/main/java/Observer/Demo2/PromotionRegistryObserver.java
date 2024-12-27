package Observer.Demo2;

import Observer.MyEventBus.Subscribe;

public class PromotionRegistryObserver {

    @Subscribe
    void handleRegisterSuccess(Long userId) {
        System.out.println("Send registry gift to user " + userId);
    }
}
