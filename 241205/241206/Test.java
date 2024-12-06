package study;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("점수를 입력하세요.");
        score = scanner.nextInt();
        System.out.println(score);
        String num = "";
        if (score >= 90) {
            num = "A";
        } else if (score >= 80) {
            num = "B";
        } else if (score >= 70) {
            num = "C";
        } else if (score >= 60) {
            num = "D";
        } else {
            num = "F";
        }
        System.out.println("학점은 " + num + " 입니다.");
    }
}
