import service.UserService;
import view.AdminView;
import view.UserView;

import java.util.Scanner;

public class vMachineMain {
    public static void main(String[] args) {
        UserView view = new UserView();
        UserService service = new UserService();

        Scanner sc = new Scanner(System.in);

        int num = 0;
        while (true) {
            System.out.println("1.회원가입 2.로그인 3.종료");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    view.signUp();
                    break;
                case 2:
                    view.logIn();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("잘 못 입력하였습니다.");
            }
        }
    }
}
