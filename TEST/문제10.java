package basic.exam;

import java.util.Scanner;

public class 문제10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 3; j <= 3; j++) {
                System.out.println(j + "*" + i + "=" + (i*j));
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단수를 입력 : ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan*i));
        }

    }
}
