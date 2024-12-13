package oopCh03;

public class 광전사 {
    String name = "광전사";

    public void  기본공격() {
        System.out.println("도끼로 공격");
    }

    public void 기본공격 (궁수 e) {
        System.out.println("도끼로 " + e.name + " 공격하기");
    }

    public void 기본공격 (전사 e) {
        System.out.println("도끼로 " + e.name + " 공격하기") ;
    }
}
