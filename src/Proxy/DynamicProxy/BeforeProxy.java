package Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class BeforeProxy {

    public BeforeProxy() {}

    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        BeforeProxyHandler handler = new BeforeProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }
}
