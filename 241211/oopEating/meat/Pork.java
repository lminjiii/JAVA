package oopEating.meat;

public class Pork implements Meat{
    private String name = "돼자고기";
    private String brand = "한돈";

    @Override
    public String eat() {
        return brand + " " + name + "을 먹어요";
    }
}
