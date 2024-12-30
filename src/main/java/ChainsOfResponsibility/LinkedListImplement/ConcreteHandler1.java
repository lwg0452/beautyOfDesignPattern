package ChainsOfResponsibility.LinkedListImplement;

public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public boolean doHandle() {
        //...
        System.out.println("pass Handler1...");
        boolean res = false;
        return res;
    }
}
