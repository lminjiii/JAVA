package myClass.chicken;

public class Chicken {
    public String chickenBrand;
    public String chickenMenu;
    public int chickenPrice;
    private String chickenModel;

    public  void chickenModelPrint() {
        System.out.println(this.chickenBrand + "의 모델은 "+ this.chickenModel + "입니다.");
    }

    //Getter : private 값을 요청
    public  String getChickenModel() {
        return chickenModel;
    }

    //Setter : private 값에 할당
    public  void  setChickenModel(String chickenModel) {
        this.chickenModel = chickenModel;
    }

    //기본생성자 만들기
    public Chicken() {}

    //brand, menu, price를 갖는 생성자 만들기
    public Chicken(String brand, String menu, int price) {
        this.chickenBrand = brand;
        this.chickenMenu = menu;
        this.chickenPrice = price;
    }
}
