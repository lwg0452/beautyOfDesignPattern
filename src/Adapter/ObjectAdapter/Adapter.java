package Adapter.ObjectAdapter;

import Adapter.ClassAdapter.ITarget;

public class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        System.out.println("This is Adapter's f2()");
    }

    @Override
    public void f3() {
        adaptee.f3();
    }
}
