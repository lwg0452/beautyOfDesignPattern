package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BeforeProxyHandler implements InvocationHandler {

    private Object proxiedObject;

    public BeforeProxyHandler(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Print this sentence using dynamic proxy pattern!!");
        Object result = method.invoke(proxiedObject, args);
        System.out.println("After calling: fly");
        return result;
    }
}
