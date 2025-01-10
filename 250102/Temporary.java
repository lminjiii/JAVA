class Temporary extends Employee {
    int time;
    int pay;

    public Temporary(String name, int time, int pay) {
        super(name);
        this.time = time;
        this.pay = pay;
    }

    @Override
    public int getPay() {
        return time * pay;
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("================================");
        System.out.println("고용형태 : 임시직");
        super.printEmployeeInfo();
    }
}