package basic.exam;

import java.util.Scanner;

public class 문제6 {
    public static void main(String[] args) {
        {int intA = 7;
            int intB = 9;
            System.out.println(intA + " + " + intB + " = " + (intA + intB));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요 : ");
        int firstNumber = sc.nextInt();
        System.out.println("두번쨰 수를 입력하세요 : ");
        int secondNumber = sc.nextInt();
        if (firstNumber > secondNumber){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        int sum = 0;
    }
}
