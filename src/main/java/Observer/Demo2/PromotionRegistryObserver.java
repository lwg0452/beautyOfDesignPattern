package Observer.Demo2;

import com.google.common.eventbus.Subscribe;

public class PromotionRegistryObserver {

    @Subscribe
    void handleRegisterSuccess(Long userId) {
        System.out.println("Send registry gift to user " + userId);
    }
}
