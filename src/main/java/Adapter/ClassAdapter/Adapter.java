package Adapter.ClassAdapter;

public class Adapter extends Adaptee implements ITarget{
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        System.out.println("This is main.java.Adapter's f2()");
    }

    // 这里 f3() 不需要实现，直接继承 Adaptee 的 f3()
}
