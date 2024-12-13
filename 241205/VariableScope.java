package basic;
//아래있는걸 beans 라고도 함
// static = 공용 공간이라고도 한다.

class NaJinSu {
    static String address = "인천";
    String name = "나진수";
    int age = 30;
    boolean smart = false;
    }


public class VariableScope {
    public static void main(String[] args) {

//        System.out.println(NaJinSu.name);
//        System.out.println(NaJinSu.age);
//        System.out.println(NaJinSu.smart);
        // 일반 변수는 스택에 저장된다.
        NaJinSu naJinSu = new NaJinSu();
        System.out.println(naJinSu.age); /*heap 에 올라가 new로 선언하여 stack에 즉 일반변수로 보냈기 때문에 소문자로 해도 다 보인다.*/
        System.out.println(NaJinSu.address); /*static 에 따로 있어서 대문자 NaJinSu로 해야지 보인다.*/
    }
}
