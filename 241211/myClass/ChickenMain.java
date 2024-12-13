package myClass;

import myClass.chicken.Chicken;
import myClass.createClass.Cat;

public class ChickenMain {
    public static void main(String[] args) {
        Chicken 자담 = new Chicken();
        자담.setChickenModel("권은비");
        자담.chickenBrand = "자담치킨";
        자담.chickenMenu = "간장순살치킨";
        자담.chickenPrice = 19000;
        System.out.println(자담.chickenBrand + "에서 " + 자담.chickenMenu + "을 "
                + 자담.chickenPrice + "원에 주문했습니다.");
        System.out.println(자담.chickenBrand + " 모델은 " + 자담.getChickenModel());

        Chicken 교촌 = new Chicken("교촌치킨", "간장치킨", 21000);
        System.out.println(교촌.chickenBrand+ "에서 " + 교촌.chickenMenu+ "을 "
                + 교촌.chickenPrice + "원에 주문했습니다");

        Chicken 비비큐 = new Chicken("비비큐", "황금올리브치킨", 23000);
        System.out.println(비비큐.chickenBrand + "에서 " + 비비큐.chickenMenu+ "을 "
                + 비비큐.chickenPrice + "원에 주문했습니다");
    }
}
