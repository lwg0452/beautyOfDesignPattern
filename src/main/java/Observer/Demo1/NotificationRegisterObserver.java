package Observer.Demo1;

public class NotificationRegisterObserver implements RegisterObserver {

    public NotificationRegisterObserver() {}


    @Override
    public void handleRegisterSuccess(long userId) {
        System.out.println("User " + userId + " has registered");
    }
}
