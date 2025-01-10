class Permanent extends Employee {
    int salary;
    int bonus;

    public Permanent(String name, int salary, int bonus) {
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int getPay() {
        return salary + bonus;
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("================================");
        System.out.println("고용형태 : 정규직");
        super.printEmployeeInfo();
    }
}