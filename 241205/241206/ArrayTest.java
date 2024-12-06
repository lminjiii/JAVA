package study;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));
        String[] 과일 = new String[5];
        과일[0] = "사과";
//        과일[1] = "귤";
        과일[2] = "포도";
        과일[3] = "키위";
        int[] price = new int[5];
        price[0] = 100;
//        price[1] = 200;
        price[2] = 300;
        price[3] = 400;
        for (int i = 0; i < 과일.length; i++) {
            if (과일[i] != null) {
                System.out.println(과일[i] + " (" +price[i] + "W)");
            }
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("몇번째 과일바구니를 수정하시겠습니까?");
            int sum  = scanner.nextInt();
            System.out.println(과일[sum] + "을 선택하셨습니다.");
            System.out.println("무엇으로 바꿀까요?");
            String 과일이름 = scanner.next();
            과일[sum] = 과일이름;
            System.out.println(Arrays.toString(과일));
            System.out.println("종료 하시겠습니까? (Y/N) ");
            String 답 = scanner.next();
            if (답.equals("Y")) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
