package review;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        int sum = 0;
        //두 수를 입력 받아서 합계를 구하는 프로그램
        //1. 두 수를 스캐너를 통해 입력 받는다.
        //문제점 : 앞 수가 더 큰 경우는 두 수를 바꿔줘야 함.
        //2. 두 수 사이의 값들을 합한다.
        Scanner sc = new Scanner(System.in);

        //첫번째 수를 입력 받는다.
        System.out.println("첫번째 수를 입력하세요.");
        int oneNumber = sc.nextInt();

        //두번째 수를 입력 받는다.
        System.out.println("두번째 수를 입력하세요.");
        int twoNumber = sc.nextInt();

        //두 수를 비교해서 첫번째 값이 크연 두 수를 바꾼다.
        if (oneNumber > twoNumber) {
            int temp = oneNumber;
            oneNumber = twoNumber;
            twoNumber = temp;
        }
        //두 수 사이의 값들을 합한다.
        for (int i = oneNumber; i <= twoNumber; i++) {
           sum = sum + i;
        }
        System.out.println("두 수의 합은 : " + sum);
      }
    }

