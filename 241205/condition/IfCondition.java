package basic.condition;

public class IfCondition {
    public static void main(String[] args) {
//        조건 판단문
//        1. 점수 60점 이상: 합격, 불합격
        int score = 61;
        String pass = "합격";
        String fail = "불합격";

        if (score >= 60) {
            System.out.println(pass);
        }else {
            System.out.println(fail);
        }

    }
}
