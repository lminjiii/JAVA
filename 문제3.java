package basic.exam;

public class 문제3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
            System.out.println("i = " + i);
        }
        for (int j = 2; j <= 20; j=j+2) {
            System.out.println("j = " + j);
        }
    }
}

