package basic.exam;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        if (intA > intB) {
            int temp = intA;
            intA = intB;
            intB = temp;
        }

        int n = intB - intA + 1;
        int sum = n * (intA + intB) / 2;

        if (intA <= 0 || intB <= 0) {
            System.out.println("0보다 큰 값을 입력하세요.");
        } else {

            System.out.println(sum);
        }
    }
}
