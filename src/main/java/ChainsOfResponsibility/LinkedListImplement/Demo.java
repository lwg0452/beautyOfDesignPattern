package ChainsOfResponsibility.LinkedListImplement;

public class Demo {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new ConcreteHandler1());
        handlerChain.addHandler(new ConcreteHandler2());

        handlerChain.handle();
    }
}
