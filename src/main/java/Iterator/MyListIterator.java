package Iterator;

public interface MyListIterator<T> {

    // 第一种迭代器接口
    boolean hasNext();
    void next();
    T currentItem();

    // 第二种迭代器接口
//    boolean hasNext();
//    T next();
}
