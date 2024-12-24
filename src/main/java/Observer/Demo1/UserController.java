package Observer.Demo1;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    private List<RegisterObserver> registerObservers = new ArrayList<>();

    public void setRegisterObservers(List<RegisterObserver> observers) {
        registerObservers.addAll(observers);
    }

    long registry(String username, String password) {

        // 调用 Service 层方法
        // userId = userService.registry(username, password);
        long userId = 1111111L;
        for (RegisterObserver observer : registerObservers) {
            observer.handleRegisterSuccess(userId);
        }
        return userId;
    }

}
