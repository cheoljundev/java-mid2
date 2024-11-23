package two.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        //코드 작성

        Set<Integer> union = set1;
        union.addAll(set2);

        System.out.print("합집합 : [");
        Iterator<Integer> unionIter = union.iterator();
        while (unionIter.hasNext()) {
            System.out.print(unionIter.next());
            if (unionIter.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 : " + intersection);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("차집합 : " + difference);

    }
}
