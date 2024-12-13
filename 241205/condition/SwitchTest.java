package basic.condition;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = n / 10;
        switch (n) {
            case 10:
                System.out.println("수");
                break;
            case 9:
                System.out.println("수");
                break;
            case 8:
                System.out.println("우");
                break;
            case 7:
                System.out.println("미");
                break;
            case 6:
                System.out.println("양");
                break;
            default:
                System.out.println("가");
        }
        }
    }

