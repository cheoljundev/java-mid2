package two.collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 80);
        System.out.println(studentMap);

        // 덮어쓰기
        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}
