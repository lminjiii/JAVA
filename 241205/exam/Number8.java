package basic.exam;

import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 라인수를 입력 : ");
        int line = sc.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println("");

        }

    }
}
