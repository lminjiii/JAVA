package basic.exam;

import java.util.Scanner;

public class Number14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int largeNum;
        int sum;

        if (A == B && B == C) {
            sum = 10000 + (A * 1000);
            System.out.println(sum);
        } else if (A == B || A == C || B == C) {
            if (A == B || A == C) {
                sum = 1000 + (A * 100);
                System.out.println(sum);
            } else {
                sum = 1000 + (B * 100);
                System.out.println(sum);
            }
        } else {
            sum = Math.max(A, Math.max(B, C));
            sum = sum * 100;
            System.out.println(sum);
        }
    }
}
