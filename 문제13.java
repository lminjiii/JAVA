package basic.exam;

import java.util.Scanner;

public class 문제13 {
    public static void main(String[] args) {

        {Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int C = in.nextInt();

        int min = 60 * A + B;
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("현재 시간 : ");
        int hour = sc.nextInt();
        System.out.println("현재 분 : ");
        int minute = sc.nextInt();
        System.out.println("요리 시간 : ");
        int time = sc.nextInt();

        int totalTime = (hour * 60) + minute + time;

        hour = (totalTime / 60) % 24;

        minute = totalTime % 60;
        System.out.println(hour + " " + minute);
    }
}
