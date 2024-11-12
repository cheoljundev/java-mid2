package one.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num == 0) {
                break;
            }
            inputs.add(num);
        }
        System.out.println("출력");
        int total = 0;
        for (Integer input : inputs) {
            total += input;
        }
        double average = (double) total / inputs.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
