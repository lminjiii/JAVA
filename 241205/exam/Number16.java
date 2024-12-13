package basic.exam;

/*문제 15. 다음을 구현하세요.


처음 프로그램이 시작되면....

======================
메뉴를 선택하세요
======================
1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기

각 번호를 선택하면..

안녕하세요
삐끼삐끼 춤입니다.
맛나게 먹었습니다.
프로그램을 종료합니다.

1~3번을 선택하면 해당 메시지를 보여주고
다시 메뉴선택화면을 보여줍니다.

4번을 선택하면 메시지를 출력하고 멈춥니다.*/

import java.util.Scanner;

public class Number16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choiceNumber;
        while (true) {
            System.out.print("======================\n"+"메뉴를 선택하세요\n"+"======================\n");
            System.out.print("1. 인사하기 " + "2. 춤추기 " + "3. 밥먹기 " + "4. 종료하기\n");
            choiceNumber = sc.nextInt();
            if (choiceNumber == 1) {
                System.out.println("안녕하세요");
            } else if (choiceNumber == 2) {
                System.out.println("삐끼삐끼 춤입니다.");
            } else if (choiceNumber == 3) {
                System.out.println("맛나게 먹었습니다.");
            } else if (choiceNumber == 4) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("1~4의 숫자를 입력하세요.");
            }
        }
    }
}
