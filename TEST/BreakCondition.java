package basic.condition;

public class BreakCondition {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return;
            }
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
