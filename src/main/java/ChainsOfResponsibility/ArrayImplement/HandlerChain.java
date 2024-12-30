package ChainsOfResponsibility.ArrayImplement;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        boolean handled = false;
        for (IHandler handler : handlers) {
            handled = handler.handle();
            if (handled) {
                return;
            }
        }
    }

}
