package two.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray array = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = array.iterator();

        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }

        System.out.println("iterator.hasNext() = " + iterator.hasNext()); // false, 이터레이터는 일회성이다.

    }
}
