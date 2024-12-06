import java.util.Scanner;

public class VendingMachine_v01 {
    static String[] product = new String[5];
    static int[] price = new int[5];
    static int[] stock = new int[5];
    public static void main(String[] args) {

        product[0] = "콜라";
        product[1] = "사이다";
        product[2] = "커피";

        price[0] = 500;
        price[1] = 700;
        price[2] = 1500;

        stock[0] = 3;
        stock[1] = 3;
        stock[2] = 3;
        while (true) {
            System.out.println("=======================================================");
            System.out.println("자판기 입니다. (번호 : 상품 (가격) - 재고)");
            System.out.println("1.콜라(500W) - 3개 2.사이다(700W) - 3개 3.커피(1500W) - 3개");
            System.out.println("=======================================================");
            Scanner scanner = new Scanner(System.in);
            System.out.println("돈을 넣어주세요.");
            int money = scanner.nextInt();
            if (money == 1004) {
                admin();
            } else {
                System.out.println(money + "원");
                System.out.println("메뉴 입력 :");
                int num = scanner.nextInt();
                if (money < price[num]) {
                    System.out.println("잔액이 부족합니다!");
                } else {
                    System.out.println(product[num] + "이(가) 나왔다!");
                }
                System.out.println("잔액 : " + (money - price[num] + "원"));
                System.out.println("1  : 계속 구매하기 2: 금액 추가하기 3 : 잔돈 반환하기");
                System.out.println("번호를 입력하세요.");
                int numm = scanner.nextInt();
                if (numm == 3) {
                    System.out.println("거스름돈" + (money - price[num]) + "반환 됩니다.");
                    System.out.println("감사합니다! 다음에 또 이용해주세요!!!");
                }
            }
        }
    }
    private static void admin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("관리자 페이지입니다.");
            System.out.println("1 : 메뉴변경 2 : 가격변경 3 : 재고추가 4 :메뉴추가 5 : 수익확인 (종료는 - 1)");
            System.out.println("번호를 입력하세요.");
            int twoNum = scanner.nextInt();
            if (twoNum == 1) {
                System.out.println("변경하실 메뉴의 번호를 입력하세요. ( 1~ 3 )");
                int newNum = scanner.nextInt();
                System.out.println(product[newNum - 1] + "를(을) 무엇으로 바꾸시겟습니까?");
                String twoProduct = scanner.next();
                product[newNum - 1] = twoProduct;
                System.out.println(product[newNum - 1] + "의 가격은 얼마 입니까?");
                int twoPrice = scanner.nextInt();
                price[newNum - 1] = twoPrice;
                System.out.println(product[newNum - 1] + "의 재고를 몇 개 등록 하시겠습니까?");
                int twoStock = scanner.nextInt();
                stock[newNum - 1] = twoStock;
                System.out.println("메뉴 변경이 완료되었습니다!");
            } else if (twoNum == 2) {
                System.out.println("가격을 변경하실 메뉴의 번호를 입력하세요 ( 1 ~ 3 )");
                int priceNum = scanner.nextInt();
                System.out.println(product[priceNum - 1] + "의 가격을 얼마로 바꾸시겠습니까?");
                int newPrice = scanner.nextInt();
                price[priceNum - 1] = newPrice;
                System.out.println("가격 변경이 완료 되었습니다!");
            } else if (twoNum == 3) {
                System.out.println("재고를 추가하실 메뉴의 번호를 입력하세요. ( 1 ~ 3 )");
                int stockNum = scanner.nextInt();
                System.out.println(product[stockNum - 1] + "를(을) 몇 개 추가 하시겠습니까?");
                int newStock = scanner.nextInt();
                stock[stockNum - 1] = newStock;
                System.out.println("재고 추가가 완료 되었습니다!");
            } else if (twoNum == 4) {
                boolean flag = true;
                for(int i=0; i<=4; i++){
                    if(product[i]=="")
                        flag = false;
                }
                if (flag == true) {
                    System.out.println("더 이상 메뉴가 들어갈 자리가 없습니다!");
                    return;
                } else
                    System.out.println("추가하실 메뉴의 가격을 입력하세요.");
                int newMenuPrice = scanner.nextInt();
                price[3] = newMenuPrice;
                System.out.println("추가하실 메뉴의 이름을 입력하세요");
                String newMenu = scanner.next();
                product[3] = newMenu;
                System.out.println(newMenu + "의 재고는 몇 개 입니까?");
                int newMenuStock = scanner.nextInt();
                System.out.println("메뉴 추가가 완료 되었습니다!");
            } else if (twoNum == 5) {
                System.out.println("현재까지 수익은 2000W 입니다.");
            } else if (twoNum == -1) {
                return;
            }
        }
    }
}
