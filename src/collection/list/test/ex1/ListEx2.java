package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
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
        for (int i = 0; i < inputs.size(); i++) {
            System.out.print(inputs.get(i));
            if (i != inputs.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
