package myClass.car;

public class Car {
    private String brand;
    private int power;
    private String name;
    private String color;
    private boolean navigation;
    private int speed = 0;

    public String carInfo() {
        String info = "나의 애마 " + this.name + "은 " +
                this.brand + " 브랜드 " + this.power + "cc입니다.";
        return info;
    }

    public Car(String brand, String name, int power) {
        this.brand = brand;
        this.name = name;
        this.power = power;
    }
    public void speedUp() {
        this.speed = this.speed + 5;}
    public void speedDown() {
        this.speed = this.speed - 5;}

    public  int getSpeed() {
        return this.speed;
    }

    //color getter
    public  String getColor() {
        return this.color;
    }
    //color setter
    public  void  setColor(String color) {
        this.color = color;
    }
    //네비게이션의 getter
    public boolean getnavigation() {
        return this.navigation;
    }
    //네비게이션의 getter
    public  void  setNavigation(boolean navigation) {
        this.navigation = navigation;
    }
}

