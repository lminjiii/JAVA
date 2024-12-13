package basic;

public class OperationEx03 {
    public static void main(String[] args) {
//        논리연산자
//        and : &&, or : || , not : !
//        3 < 4 < 5
        int a = 4, b = 3, c = 4;
        System.out.println(a<b);

//        성적을 국어점수 (kor) 변수에 담아요 default value = 51
//        성적을 영어점수 (eng) 변수에 담아요 default value = 80
//        조건1. 두 점수 중 한가지만 60이상이면 합격
//        조건1 결과: 합격

//        조건2. 두 점수 모두 60점 넘으면 합격
//        조건2. 결과 : 불합격

        int kor = 51;
        int eng = 80;
        String pass = "합격";
        String fail = "불합격";

        String result = (kor >= 60 || eng >= 60) ? pass : fail;
        System.out.println(result);

        String result2 = (kor >= 60 && eng >= 60) ? pass : fail;
        System.out.println(result2);

        int i = 1;
        i = i + 1;
        i += 1;
        i++;
//        ++i; 사용 안한다.
        System.out.println(i);




    }
}
