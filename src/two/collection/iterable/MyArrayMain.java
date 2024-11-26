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

        // for-each 사용
        // for-each(enhanced for)문은 iterable이 구현된 클래스의 인스턴스에서만 사용이 가능하다.
        for (Integer value : array) {
            System.out.println("value = " + value);
        }
    }
}
