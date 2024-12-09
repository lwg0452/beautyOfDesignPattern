package Singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorDoubleCheck {

    private AtomicLong Id;
    private static volatile IdGeneratorDoubleCheck instance;

    private IdGeneratorDoubleCheck() {
        this.Id = new AtomicLong(0);
    }

    public static IdGeneratorDoubleCheck getInstance() {

        // 1. 判断对象是否已经创建
        if (instance == null) {
            synchronized (IdGeneratorDoubleCheck.class) {
                // 2. 判断其他线程是否已经创建对象
                if (instance == null) {
                    instance = new IdGeneratorDoubleCheck();
                }
            }
        }
        return instance;
    }
}
