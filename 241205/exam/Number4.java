package basic.exam;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
//        임의의 값 n이 주어지면 ex)5라고 하면 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5) 의 결과를 출력하시오

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                result += j;
            }


        }
        System.out.println(result);

    }
}
