package two.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] arr : productArr) {
            productMap.put(arr[0], Integer.valueOf(arr[1]));
        }
        System.out.println(productMap);
        // Map의 모든 데이터 출력 - 코드 작성
    }
}
