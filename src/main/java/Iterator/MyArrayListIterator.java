package Iterator;

import java.util.NoSuchElementException;

public class MyArrayListIterator<T> implements MyListIterator<T> {

    int index;
    private MyList<T> list;

    public MyArrayListIterator(MyList<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext(){
        return index < list.size();
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public T currentItem() {
        if (index >= list.size()) {
            throw new NoSuchElementException();
        }
        return list.get(index);
    }
}
