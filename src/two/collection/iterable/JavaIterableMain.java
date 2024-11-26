package two.collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> listIter = list.iterator();
//        while (listIter.hasNext()) {
//            System.out.println("listIter.next() = " + listIter.next());
//        }

//        printAll(listIter);

        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> setIter = set.iterator();
//        while (setIter.hasNext()) {
//            System.out.println("setIter.next() = " + setIter.next());
//        }

//        printAll(setIter);

        foreach(set);
    }

    private static void foreach(Iterable<Integer> iterable) {
        for (Integer value : iterable) {
            System.out.println("value = " + value);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
