package two.collection.utils;

import java.util.List;
import java.util.Map;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 클래스 생성
        List<Integer> list = List.of(1, 2, 3);
        // list.add(20); 불가능
        Map<String, Integer> map = Map.of("a", 1, "b", 2);
        // map.put("c", 3); 불가능

        System.out.println("list class = " + list.getClass());

    }
}
