package myClass.compostion;
//만들어져 있는 엔진을 가져다 사용만 할 거임
public class Car {
    //생성자 주입 방법
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public int engininfo() {
        return engine.getPower();
    }
}
