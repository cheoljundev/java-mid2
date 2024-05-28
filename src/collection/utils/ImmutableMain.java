package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변 리스트로 변환
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println(mutableList);
        System.out.println("mutableList class = " + mutableList.getClass());

        // 가변 리스트를 불변 리스트로 변환
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        // unmodifiableList.add(5); // 불가능
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());
    }
}
