import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("고용형태 - 정규직<P>, 임시직<T>를 입력하세요. \n");
        String employmentType = scanner.nextLine();

        if (employmentType.equals("P")) {
            System.out.print("이름을 입력하세요. \n");
            String name = scanner.nextLine();
            System.out.print("기본급을 입력하세요. \n");
            int salary = Integer.parseInt(scanner.nextLine());
            System.out.print("보너스를 입력하세요. \n");
            int bonus = Integer.parseInt(scanner.nextLine());

            Permanent permanentEmployee = new Permanent(name, salary, bonus);
            permanentEmployee.printEmployeeInfo();

        } else if (employmentType.equals("T")) {
            System.out.print("이름, 작업 시간, 시간당 급여를 입력하세요. \n");
            System.out.print("이름을 입력하세요. \n");
            String name = scanner.nextLine();
            System.out.print("작업시간을 입력하세요. \n");
            int time = Integer.parseInt(scanner.nextLine());
            System.out.print("시간당급여를 입력하세요. \n");
            int pay = Integer.parseInt(scanner.nextLine());

            Temporary temporaryEmployee = new Temporary(name, time, pay);
            temporaryEmployee.printEmployeeInfo();

        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
