package ChainsOfResponsibility.ArrayImplement;

public class HandlerA implements IHandler{
    @Override
    public boolean handle() {
        // ...
        System.out.println("Pass HandlerA...");
        return false;
    }
}
