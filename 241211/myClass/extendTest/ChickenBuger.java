package myClass.extendTest;

public class ChickenBuger extends Hamburger{
    private String name = "치킨버거";

    public  String getName() {
        return this.name;
    }

    private String 재료3 = "닭다리치킨";

    public  String get재료3() {
        return this.재료3;
    }

    public void  eating() {
        System.out.println("치킨버거를 먹습니다.");
    }
}
