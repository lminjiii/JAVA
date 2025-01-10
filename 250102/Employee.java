import java.util.Scanner;

abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract int getPay();

    public void printEmployeeInfo() {
        System.out.println("이      름 : " + name);
        System.out.println("급      여 : " + getPay() + "원");
    }
}