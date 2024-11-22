package two.collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);

        // 검색
        boolean contains = set.contains("a");
        System.out.println("contains = " + contains);

        // 삭제
        set.remove("a");
        System.out.println(set);
    }
}
