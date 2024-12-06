package study;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("나이를 입력하세요.");
        age = scanner.nextInt();
        System.out.println(age);
        if (age > 20) {
            System.out.println("투표가 가능합니다.");
        } else {
            System.out.println("투표가 불가능합니다.");
        }
    }
}
