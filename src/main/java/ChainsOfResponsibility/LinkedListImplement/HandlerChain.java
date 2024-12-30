package ChainsOfResponsibility.LinkedListImplement;

public class HandlerChain {

    AbstractHandler head;
    AbstractHandler tail;

    public void addHandler(AbstractHandler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setNextHandler(handler);
        tail = handler;
    }

    public void handle() {
        if (head == null) {
            return;
        }
        head.handle();
    }
}
