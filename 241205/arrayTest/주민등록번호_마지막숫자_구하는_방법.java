package basic.arrayTest;


public class 주민등록번호_마지막숫자_구하는_방법 {
    public static void main(String[] args) {
        int[] residentRegistrationNum = {1,4,0,4,1,6,4,1,4,0,1,8};
        int totalNum = 0;
        int A = 2;

        for (int i = 0; i < residentRegistrationNum.length - 1; i++) {
            totalNum += residentRegistrationNum[i] * A;
            A++;
            if (A == 10) {
                A = 2;
            }
        }
        System.out.println(totalNum);
        totalNum = (11 - (totalNum % 11)) % 10;
        System.out.println(totalNum);

    }
}
