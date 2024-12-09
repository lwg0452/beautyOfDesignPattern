package singleton;

import java.util.concurrent.atomic.AtomicLong;
// Lazy Initialization 懒汉式
public class IdGeneratorHungry {

    // 共享变量
    private AtomicLong id = new AtomicLong(0);
    // 将实例声明为静态内部类
    private static final IdGeneratorHungry instance = new IdGeneratorHungry();

    // 将构造方法声明为私有方法
    private IdGeneratorHungry() {}

    // 提供一个方法供外部访问实例
    public static IdGeneratorHungry getInstance() {
        return instance;
    }

    // 操作共享变量的方法
    public Long getId() {
        return id.incrementAndGet();
    }
}
