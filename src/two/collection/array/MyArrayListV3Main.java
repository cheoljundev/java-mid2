package two.collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        // 삭제
        Object removedLast = list.remove(4);
        System.out.println("removedLast = " + removedLast);
        System.out.println(list);

        Object removedFirst = list.remove(0);
        System.out.println("removedFirst = " + removedFirst);
        System.out.println(list);
    }
}
