package basic.exam;

import java.util.Scanner;

public class Number10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단수를 입력: ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }
}