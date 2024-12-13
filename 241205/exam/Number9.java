package basic.exam;

import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 라인수를 입력 : ");
        int line = sc.nextInt();
        for (int i = line; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.printf("*");
            }
            System.out.println("");

        }

    }
}
