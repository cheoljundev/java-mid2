package one.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        Set<Integer> set = new HashSet<>();
        for (Integer integer : inputArr) {
            set.add(integer);
        }

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
