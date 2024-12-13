package basic.baseballgame;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallgame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //정답이 들어갈 배열
        int[] result = new int[3];
        //게이머가 입력한 값을 갖을 배열
        int[] input = new int[3];
        //10번 기회주기

        //1. 세자리 서로 다른 수를 생성
        createGame(result);
        String yesOrNo = "";

        while (!yesOrNo.equals("Y")) {
            //2. 사용자에게 서로 다른 3개 숫자를 입력 받아요
            //235 ---> 배열에 쪼개 넣어야지요
            for (int i = 1; i <= 10; i++) {
                inputData(input);
                //3. 이제 맞는지 검사
                boolean check = checkValue(result, input);
                if (check == true) {
                    System.out.println("정답입니다");
                    break;
                }
            }
            System.out.println("게임을 더 종료하시겠습니까(Y/N)");
            yesOrNo = sc.next();
        }
    }

    private static boolean checkValue(int[] result, int[] input) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (input[i] == result[j]) {
                        strike++;
                        break;
                    }
                } else {
                    if (input[i] == result[j]) {
                        ball++;
                        break;
                    }
                }
            }
        }
        System.out.println("strike : " + strike + ", ball : " + ball);
        if (strike == 3) {
            return true;
        } else {
            return false;
        }
    }

    private static void inputData(int[] input) {
        System.out.println("서로다른 번호 3자리 입력");
        String[] data = sc.next().split("");
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(data[i]);
        }
    }
    //세자리 다른 점수 값 생성하기(정답용)
    private static void createGame(int[] result) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            result[i] = -1;
        }
        boolean flag = false; //중복검사용
        while (count <= 2) {
            num = (int) (Math.random() * 10);
            for (int i = 0; i <= count; i++) {
                if (num == result[i]) flag = true;
            }
            if (flag == false) {
                result[count] = num;
                count++;
            } else {
                flag = false;
            }
        }
        System.out.println("정답 : " + Arrays.toString(result));
    }
}

