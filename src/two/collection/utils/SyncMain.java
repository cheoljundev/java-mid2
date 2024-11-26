package two.collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collection<Integer> synchronizedList = Collections.synchronizedCollection(list);

        System.out.println(list.getClass());
        System.out.println(synchronizedList.getClass());
    }
}
