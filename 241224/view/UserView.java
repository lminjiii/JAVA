package view;

import dto.UserDto;
import dto.ProductDto;
import repository.AdminRepository;
import repository.ProductRepository;
import repository.UserRepository;
import service.UserService;

import java.util.List;
import java.util.Scanner;

public class UserView implements UserViewInterface {

    UserDto memberDto = new UserDto();
    ProductDto productDto = new ProductDto();
    UserService userService = new UserService();
    AdminRepository adminRepository = new AdminRepository();
    UserRepository userRepository = new UserRepository();
    ProductRepository productRepository = new ProductRepository();
    AdminView adminView = new AdminView();


    Scanner sc = new Scanner(System.in);

    @Override
    public void signUp() {
        System.out.println("===== 회원가입 화면 =====");

        UserDto dto = new UserDto();

        System.out.println("가입하실 아이디를 입력해주세요.");
        String signUpID = sc.next();
        dto.setId(signUpID);

        System.out.println("가입하실 비밀번호를 입력해주세요.");
        String signUpPassword = sc.next();
        dto.setPassword(signUpPassword);

        System.out.println("가입하실 닉네임를 입력해주세요.");
        String signUpNIkname = sc.next();
        dto.setNickname(signUpNIkname);

        System.out.println("가입하실 번호를 입력해주세요.");
        String signUpPhone = sc.next();
        dto.setPhone(signUpPhone);

        int result = userService.signUpService(dto);

        if (result > 0) {
            System.out.println("회원가입이 완료 되었습니다♥");
        } else {
            System.out.println("회원가입에 실패 했습니다. 관리자에게 문의하세요.");
        }
    }

    @Override
    public void logIn() {
        System.out.println("===== 로그인 화면 =====");
        System.out.println("ID를 입력해주세요");
        String logInID = sc.next();

        System.out.println("비밀번호를 입력해주세요");
        String logINPassword = sc.next();

        if (userService.isAdmin(logInID, logINPassword)) {
            System.out.println("관리자 계정으로 로그인 성공!");
            adminView.adminMenu();
            return;
        }
        if (userService.validateUser(logInID, logINPassword)) {
            System.out.println("로그인 성공!");
            userMenu(logInID);
            return;
        }
        System.out.println("회원 정보를 찾을 수 없습니다. 회원가입을 진행합니다 ");
        signUp();
    }

    @Override
    public void userMenu(String userId) {
        while (true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 금액 충전 2. 잔돈 반환 3. 메뉴 선택 4. 로그아웃");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("충전할 금액을 입력 해주세요. (천원단위로만 가능합니다)");
                    int money = sc.nextInt();
                    boolean success = userService.recharge(userId, money);
                    if (!success){
                        System.out.println("충전에 실패하였습니다. 다시 시도해주세요");
                    }
                    break;
                }
                case 2:
                    int change = userService.returnChange(userId);
                    System.out.println("반환된 잔돈 : " + change + "원");
                    break;

                case 3:
                    viewProduct();
                    purchaseProduct(userId);
                    break;

                case 4: {
                    System.out.println("로그아웃 되었습니다");
                    return;
                }
                default:
                    System.out.println("잘 못 입력하였습니다");
            }
            }
        }

    @Override
    public void viewProduct() {
        System.out.println("===== 제품 목록 =====");
        List<ProductDto> productList = userService.getAllProduct();
        for (ProductDto product : productList) {
            System.out.printf("ID: %d | 이름: %s | 가격: %d원 | 재고: %d개%n",
                    product.getProductId(), product.getProductName(), product.getPrice(), product.getStock());
        }
    }

    @Override
    public void purchaseProduct(String userId) {
        System.out.println("구매할 제품 ID를 입력하세요");
        int productId = sc.nextInt();

        boolean result = userService.purchaseProduct(userId, productId);
    }
}

