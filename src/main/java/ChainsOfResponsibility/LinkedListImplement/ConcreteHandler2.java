package ChainsOfResponsibility.LinkedListImplement;

public class ConcreteHandler2 extends AbstractHandler{
    @Override
    public boolean doHandle() {
        //...
        System.out.println("pass Handler2...");
        boolean res = true;
        return res;
    }
}
