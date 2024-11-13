package two.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 타입 안정성과 코드 재사용성을 모두 챙길 수 있다.
    }
}