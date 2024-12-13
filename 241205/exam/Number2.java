package basic.exam;

public class Number2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            do {
                if (i == 3) {
                    break;
                }
                System.out.println(i);
            } while (false);
        }

    }
}
