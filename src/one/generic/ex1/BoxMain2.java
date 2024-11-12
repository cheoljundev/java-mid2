package one.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get(); // Object -> String
        System.out.println("string = " + string);

        // 잘못된 타입 잘못 입력시
        // integerBox.set("문자100");
        // Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅예외
        // System.out.println("result = " + result);
    }
}
