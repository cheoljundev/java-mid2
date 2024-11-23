package two.collection.set.test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        TreeSet<Integer> set = new TreeSet<>(List.of(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
