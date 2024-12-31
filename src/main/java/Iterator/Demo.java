package Iterator;

public class Demo {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        MyListIterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            int x = iterator.currentItem();
            System.out.println(x);
            iterator.next();
        }
    }
}
