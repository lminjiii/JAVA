package basic.condition;

public class DoLoopTest {
    public static void main(String[] args) {
//        while(조건문)
//        Do ~ while(실행문)     (조건에 맞는동안 무조건 돌려 그리고 조건은 나중에 뒤에서 판단)

//        while
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum + i;
            i++;

        }
        System.out.println(sum);

//        do while
        i = 0;
        sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 10);
        System.out.println(sum);

    }
}
