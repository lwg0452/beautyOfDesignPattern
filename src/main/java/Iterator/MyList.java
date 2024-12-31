package Iterator;

public interface MyList<T> {

    T get(int index);

    MyListIterator<T> iterator();

    int size();

    void add(T element);
}
