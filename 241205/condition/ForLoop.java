package basic.condition;

public class ForLoop {
    public static void main(String[] args) {
//        1부터5까지 더하고 싶어요
//        1+2+3+4+5 15가 result에 들어가야함

        int sumValue = 0;

//        value = value + 1;
//        sumValue = sumValue + value;
//        value = value + 1;
//        sumValue = sumValue + value;
//        value = value + 1;
//        sumValue = sumValue + value;
//        value = value + 1;
//        sumValue = sumValue + value;
//        value = value + 1;
//        sumValue = sumValue + value;

//        for(i = o; i <= 5; i++)

        for (int i = 1; i <= 5; i++) {
            sumValue += i;
            System.out.println(sumValue);
        }

        System.out.println("1~5까지 합한 합은 : " +sumValue + " 입니다.");

//        나진수 5번 출력하기
//        적은만큼 n번 돈다. bigO = n
        for (int i = 1; i <= 5; i++) {
            System.out.println("나진수");
        }

//        이중 for구문    i가 증감을 한번 하면 j는 for문의 아래 결과값 5번을 돈다. 이중for 문은 n^ 만큼 돈다.
//        i가 2번이 증감되서 출력된다면 j는 2의 제곱만큼 즉 한번출력될때마다 j는 4번 출력된다.
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단은 ");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i * j);
            }
        }





    }
}
