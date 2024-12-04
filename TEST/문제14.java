package basic.exam;

import java.util.Scanner;

public class 문제14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a != b && b != c && a != c) {
            int max;
            if (a > b) {
                if (c > a) {
                    max = c;
                } else {
                    max = a;
                }
            } else {
                if (c > b) {
                    max = c;
                } else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        } else {
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            } else {
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                } else {
                    System.out.println(1000 + b * 100);
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 주사위 값 : ");
        int dice_1 = sc.nextInt();
        System.out.println("두번째 주사위 값 : ");
        int dice_2 = sc.nextInt();
        System.out.println("세번째 주사위 값 : ");
        int dice_3 = sc.nextInt();

        int max = 0;
        if (dice_1 > max) max = dice_1;
        if (dice_2 > max) max = dice_2;
        if (dice_3 > max) max = dice_3;
        System.out.println("max = " + max);

        int same = 0;

        int sameNumber = 0;

        if (dice_1 == dice_2) {
            same = same + 1;
            sameNumber = dice_1;
        }
        if (dice_1 == dice_3) {
            same = same + 1;
            sameNumber = dice_1;
        }
        if (dice_2 == dice_3) {
            same = same + 1;
            sameNumber = dice_2;
        }
            System.out.println("same = " + same);

            int result = 0;
            switch (same){
                case 3:
                    result = 1000 + (sameNumber * 1000);
                    break;
                case 1 :
                    result = 1000 + (sameNumber * 100);
                    break;
                default :
                    result = max * 100;
            }
        System.out.println("상금은 " + result);



    }
}
