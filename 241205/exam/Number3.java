package basic.exam;

public class Number3 {
    public static void main(String[] args) {
//        EVEN = i를 2로 나누고 나머지가 0일때만 짝수이다. 그러므로 i%2==0 일때만 그 i의 값을 출력해야한다.
//        그렇다면 for문으로 continue로 하려면 홀수일 때는 넘어가게끔 하면 된다.

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
