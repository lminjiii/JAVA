package basic.mypackage;

public class OperationEx02 {
    public static void main(String[] args) {
        // 상수 선언
        final double PI = 3.14;
        //1. a에 10을 넣는다
        int a =8;
        //2. b에 20을 넣는다
        long b = 20;
        //3. a와 b를 더해서 출력한다
        System.out.println(a + b);
        //4. b를 5로 변경한다
        b = 5;
        //5. a와 b를 곱해서 출력한다
        long x = a * b;
        System.out.println("a*b = " + x);
        //6. a 나누기 b = 결과를 result 에 담아서 출력한다
        double result = (double) a / b;
        System.out.println("a / b = " + result);
        //7. numberA = 3
        int numberA = 3;
        //8. number = 7
        int numberB = 7;
        //9. 3을 7로 나눈 나머지를 구합니다
        int answer = numberA % numberB;
        //10. 결과를 answer에 담아서 출력
        System.out.println(numberA + "을" + numberB + "로 나눈 나머지는?" + answer + "입니다");
    }
}


