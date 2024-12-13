package basic.arrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class 주민등록번호_해설 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 13자리를 연속해서 입력하세요 (-제외) "); /*scanner 를 int 가 아닌 str로 받는 이유는 한번에 받아 쪼개는 작업을 하기위해 int가 아닌 str로 받는다.*/
        String[] strJumin = sc.next().split(""); /*   ""공백을 기준으로 해서 하나씩 담아주라는 뜻 */

//        정수 담는 연속배열 13개를 선언
        int[] jumin = new int[strJumin.length];
        for (int i = 0; i < strJumin.length; i++) {
            jumin[i] = Integer.parseInt(strJumin[i]);
        }

        for (int i = 0; i < jumin.length-1; i++) {
            if (i < 8) {
                result += (jumin[i] * (i + 2));

            } else {
                result += (jumin[i] * (i - 6));
            }
        }
        result = (11 - (result % 11)) % 10;

//        맞는지 틀리는지 확인해야함
        if (result == jumin[12]) {
            System.out.println("올바른 주민번호입니다.");
        } else {
            System.out.println("잘못된 주민번호입니다.");
        }

    }
}
