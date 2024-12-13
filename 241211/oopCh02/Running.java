package oopCh02;

public class Running {
    private String name;
    //기본 생성자
    public Running(){}

    //매개변수를 갖는 생성자

    public Running(String name) {
        this.name = name;
    }

    public void running() {
        System.out.println("기본 달리기");
    }

    public  void running(int distance) {
        System.out.println(distance + "km 달리기");
    }

    public void running(double distance) {
        System.out.println(distance + "km 달리기");
    }

    public  void runnning(int speed, int distance) {
        System.out.println(distance + "km를" + speed + "속도로 달리기");
    }
}
