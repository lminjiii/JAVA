package basic;

class LeeMinJi {
    static String address = "경기";
    String name = "이민지";
    int age = 20;
    boolean smart = false;
}

public class VariableScope {
    static int b = 4;
    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + VariableScope.b);
        //System.out.println(LeeMinJi.name);

        LeeMinJi leeMinJi = new LeeMinJi();
        System.out.println(leeMinJi.age);
        System.out.println(LeeMinJi.address);
        }
    }

