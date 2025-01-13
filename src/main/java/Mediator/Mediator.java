package Mediator;

import java.awt.Button;
import java.awt.Component;

public interface Mediator {

    void handleEvent(Component component, String event);
}
