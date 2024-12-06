package study;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("숫자를 입력하세요.");
        num = scanner.nextInt();
        System.out.println(num);
        if (num % 2 == 1) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("짝수 입니다.");
        }
    }
}
