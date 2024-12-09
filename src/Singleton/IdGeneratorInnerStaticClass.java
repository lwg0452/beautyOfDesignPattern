package Singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorInnerStaticClass {

    private AtomicLong id;

    private IdGeneratorInnerStaticClass() {
        this.id = new AtomicLong(0);
    }

    private static class SingletonHolder {
        private static final IdGeneratorInnerStaticClass instance = new IdGeneratorInnerStaticClass();
    }

    public IdGeneratorInnerStaticClass getInstance() {
        return SingletonHolder.instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
