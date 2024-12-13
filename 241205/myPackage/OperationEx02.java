package basic.myPackage;

public class OperationEx02 {
    public static void main(String[] args) {
//        상수 선언 (= const 와 같은 개념)
//        final double PI = 3.14;
        int a = 10;
        int b = 20;

        System.out.println("a+b의 값은 " + (a + b) + "이다.");

        b = 5;

        System.out.println("a*b의 값은 " + (a * b) + "이다.");

//        a 나누기 b 결과를 result에 담아서 출력한다.

        int result = a / b;
        System.out.println("a나누기b의 값은 " + result + "이다.");

        int numberA = 3;
        int numberB = 7;

        int answer = numberA % numberB;

        System.out.println(answer);


    }
}
