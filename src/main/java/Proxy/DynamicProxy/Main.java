package Proxy.DynamicProxy;

public class Main {

    public static void main(String[] args) {
        BeforeProxy proxy = new BeforeProxy();
        Bird proxyBird = (Bird) proxy.createProxy(new Sparrow());

        proxyBird.fly();
    }
}
