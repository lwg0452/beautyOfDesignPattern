# 桥接模式 (Bridge Design Pattern)
四个角色：抽象部分 (Abstraction)、实现部分接口 (Implementor)、具体实现部分 (Concrete Implementor)、扩展抽象部分 (Refined Abstraction)。

第一种理解：将抽象和实现解耦，让它们可以独立变化。
例子：JDBC 驱动
JDBC 是一个类库，这个类库调用 Driver 接口完成对数据库的操作。而具体的 mysql驱动实现了 Driver 接口。


第二种理解：一个类存在两个（或多个）独立变化的维度，我们通过组合的方式，让这两个（或多个）维度可以独立进行扩展。
用组合代替继承，避免继承层次指数级爆炸。
例子：
汽车
品牌：奔驰、宝马、奥迪...  m 种
变速箱：自动挡、手动挡、手自一体...  n 种

如果使用继承的方式表示汽车，需要 m * n 个类。
而如果使用组合的方式，抽象出品牌和变速箱两个接口，品牌实现品牌的接口，变速箱实现变速箱的接口，在汽车中注入这两个接口，这样只需要 m + n
 个类就可以表示。


示例代码为第二种理解方式，程序入口：Car.java
抽象部分 (Abstraction)： AbstractCar
实现部分接口 (Implementor)： Brand、Transmission
具体实现部分 (Concrete Implementor)： Audi、BMW 和 Benz 类实现了 Brand 接口，AutoTransmission、ManualTransmission 和 SemiAutoTransmission 类实现了 Transmission 接口。
扩展抽象部分 (Refined Abstraction)： Car 类继承了 AbstractCar 类，是扩展抽象部分。
