package two.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object o = GenericMethod.objMethod(i);
        Integer result1 = (Integer) o;

        System.out.println("명시적 타입인자 전달");

        Integer result2 = GenericMethod.<Integer>genericMethod(i);
        Integer result3 = GenericMethod.numberMethod(23);
        // GenericMethod.numberMethod("hello"); // 컴파일 오류
        Double doubleValue = GenericMethod.numberMethod(20.0);
        Long longValue = GenericMethod.numberMethod(20L);
    }
}
