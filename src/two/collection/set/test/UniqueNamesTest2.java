package two.collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        LinkedHashSet<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
