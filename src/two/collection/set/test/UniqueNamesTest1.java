package two.collection.set.test;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성

        HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
