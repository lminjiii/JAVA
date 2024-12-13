package oopCh04;

public class 흑마법사 extends Character{
    private String name = "흑마법사";

    public String getName() {
        return name;
    }

    public void basicAttack(Character who) {
        System.out.println(name + "이(가) " + who.getName() + " 공격하기");
    }
}
