package basic.exam;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        if (intA <= 0 || intB <= 0) {
            System.out.println("0보다 큰 수를 입력해주세요.");
        } else {
            System.out.println(intA + "+" + intB + " = " + (intA + intB));
        }

    }
}
