import view.AdminView;
import view.UserView;

import java.util.Scanner;

public class MachineMain {

    //사용자가 입력한 동 관리용
    public static int userMoney;

    public static void main(String[] args) {
        UserView view = new UserView();
        AdminView adminView = new AdminView();

        Scanner scanner = new Scanner(System.in);

        int menuNumber = 0;
        while (menuNumber != 5) {
            System.out.println("1. 동전투입 2. 잔돈반환 3. 메뉴선택 4. 관리자메뉴 5. 종료 =>");
            menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1:
                    view.insertCoin();//완료
                    break;
                case 2:
                    view.returnMoney();//완료
                    break;
                case 3:
                    System.out.println("3. 메뉴선택");
                    view.selectMenu();
                    break;
                case 4:
                    System.out.println("4. 관리자메뉴");
                    int adminMenuNumber = 0;
                    while (adminMenuNumber != 6) {
                        System.out.println("1. 메뉴등록 2. 메뉴삭제 3. 메뉴수정 4. 재고등록 5. 전체목록보기 6. 이전 =>");
                        adminMenuNumber = scanner.nextInt();
                        switch (adminMenuNumber) {
                            case 1:
                                adminView.insertMenu();//완료
                                break;
                            case 2:
                                adminView.deleteMenu();//완료
                                break;
                            case 3:
                                adminView.updateMenu();//완료
                                break;
                            case 4:
                                adminView.updateStock();//완료
                                break;
                            case 5:
                                adminView.viewAllList();//완료
                                break;
                            case 6:
                                break;//완료
                            default:
                                //완료
                                System.out.println("잘 못 입력하셨습니다.");
                                break;

                        }
                    }
                    break;
                case 5:
                    System.out.println("5. 종료");//완료
                    break;
                default:
                    System.out.println("1. 잘 못 입력하셨습니다.");
                    break;
            }
        }
    }
}
