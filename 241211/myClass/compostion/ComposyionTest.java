package myClass.compostion;

public class ComposyionTest {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car myCar = new Car(engine);
        int power = myCar.engininfo();
        System.out.println("나의 엔진은 " + power + "cc");
    }
}
