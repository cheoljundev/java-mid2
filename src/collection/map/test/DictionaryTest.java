package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");
        while (true) {
            String key, value;
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            key = sc.nextLine();
            if (key.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            value = sc.nextLine();
            dict.put(key, value);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            String key;
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            key = sc.nextLine();
            if (key.equals("q")) {
                break;
            }
            if (dict.get(key) != null) {
                System.out.println(key + "의 뜻: " + dict.get(key));
            } else {
                System.out.println(key + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
