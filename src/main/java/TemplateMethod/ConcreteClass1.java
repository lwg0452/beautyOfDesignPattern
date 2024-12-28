package TemplateMethod;

public class ConcreteClass1 extends AbstractClass {

    @Override
    protected void abstractMethod1() {
        // ...
    }

    @Override
    protected void abstractMethod2() {
        // ...
    }

    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass1();
        concreteClass.templateMethod();
    }
}
