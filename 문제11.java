package basic.exam;

import java.util.Scanner;

public class 문제11 {
    public static void main(String[] args) {
        {
            int score = 80;
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else
                System.out.println("F");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        if (score >= 90){
            System.out.println("당신의 결과는 : A");
        } else if (score >= 80) {
            System.out.println("당신의 결과는 : B");
        } else if (score >= 70) {
            System.out.println("당신의 결과는 : C");
        }else if (score >= 60) {
            System.out.println("당신의 결과는 : D");
        }else {
            System.out.println("당신의 결과는 : F");
        }
    }
}
