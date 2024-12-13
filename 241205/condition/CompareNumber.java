package basic.condition;

public class CompareNumber {
    public static void main(String[] args) {
        int A = 7;
        int B = 4;

        String s = "A = " + A + " B = " + B;
        System.out.println(s);

        A = 4;
        B = 7;
        s = "A = " + A + " B = " + B;

        if (A<B){
            System.out.println(s);
        }else {
            System.out.println("A는 B보다 큰 수 즉 " + s + " 입니다.");
        }
    }
}
