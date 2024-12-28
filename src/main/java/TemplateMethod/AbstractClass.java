package TemplateMethod;

public abstract class AbstractClass {

    public void templateMethod() {
        // ...
        abstractMethod1();
        // ...
        abstractMethod2();
        // ...
    }

    protected abstract void abstractMethod1();

    protected abstract void abstractMethod2();
}
