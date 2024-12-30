package ChainsOfResponsibility.LinkedListImplement;

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean doHandle();

    public void handle() {
        boolean handled = doHandle();
        if (!handled && nextHandler != null) {
            nextHandler.doHandle();
        }
    }
}
