package basic.exam;

import java.util.Scanner;

public class 문제12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("시간 입력 : ");
        int hour = scanner.nextInt();
        System.out.println("분 입력 : ");
        int minute = scanner.nextInt();
        if (minute >= 45){
            minute = minute - 45;
        } else if (hour == 0 && minute < 45) {
            hour = 23;
            minute = minute + 15;
        }else {
            hour = hour - 1;
            minute = minute + 15;
        }
        System.out.println(hour + " " + minute);
    }
}
