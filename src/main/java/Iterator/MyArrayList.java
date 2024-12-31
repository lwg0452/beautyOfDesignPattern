package Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> implements MyList<T> {

    List<T> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    public MyArrayList(int n) {
        list = new ArrayList<>(n);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public MyListIterator<T> iterator() {
        return new MyArrayListIterator<>(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(T element) {
        list.add(element);
    }


}
