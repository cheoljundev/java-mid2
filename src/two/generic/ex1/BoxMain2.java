package two.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str =  (String) stringBox.get();
        System.out.println("str = " + str);

        // 값을 꺼낼 때 실수가 발생할 수 있다.

    }
}
