package Observer.Demo2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        NotificationRegisterObserver notificationRegisterObserver = new NotificationRegisterObserver();
        PromotionRegistryObserver promotionRegistryObserver = new PromotionRegistryObserver();

        List<Object> observers = Arrays.asList(notificationRegisterObserver, promotionRegistryObserver);

        UserController userController = new UserController();
        userController.setRegisterObserver(observers);

        long id = userController.registry("aaa", "bbb");
    }
}
