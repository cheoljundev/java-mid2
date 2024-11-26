package two.collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1, 3};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교 : Asc");
        Arrays.sort(array, new AscComparator());
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교 : Desc");
        Arrays.sort(array, new DescComparator());
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교 : Asc+Reversed");
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println(Arrays.toString(array));

    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer scd, Integer fst) {
            System.out.println("scd = " + scd + " fst = " + fst);
            return (scd < fst) ? -1 : (scd == fst) ? 0 : 1;
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer scd, Integer fst) {
            System.out.println("scd = " + scd + " fst = " + fst);
            return (scd < fst) ? -1 : (scd == fst) ? 0 : 1 * -1;
        }
    }
}
