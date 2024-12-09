package Singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorLazy {

    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorLazy instance;

    private IdGeneratorLazy() {}

    public static synchronized IdGeneratorLazy getInstance() {
        if (instance == null) {
            instance = new IdGeneratorLazy();
        }
        return instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
