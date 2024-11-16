package two.collection.array;

public class MyArrayListV4BadMain {
    public static void main(String[] args) {
        MyArrayListV4<Integer> numberList = new MyArrayListV4<>();

        // 숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        // numberList.add("3");
        System.out.println(numberList);

        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

    }
}
