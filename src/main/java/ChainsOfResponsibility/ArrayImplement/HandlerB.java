package ChainsOfResponsibility.ArrayImplement;

public class HandlerB implements IHandler{
    @Override
    public boolean handle() {
        // ...
        System.out.println("Pass HandlerB...");
        return false;
    }
}
