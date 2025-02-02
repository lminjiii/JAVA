package oopEating.fruit;

public class Apple implements Fruit{
    private String name = "사과";
    private String taste = "신맛";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String eat() {
        return taste + "의" + name + "을 먹어요";
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
