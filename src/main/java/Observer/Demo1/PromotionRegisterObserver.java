package Observer.Demo1;

public class PromotionRegisterObserver implements RegisterObserver{

    public PromotionRegisterObserver() {}

    @Override
    public void handleRegisterSuccess(long userId) {
        System.out.println("send register gift");
    }
}
