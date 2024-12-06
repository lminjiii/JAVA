import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] product = new String[5]; // 제품명
    static int[] price = new int[5]; // 가격
    static int[] stock = new int[5]; // 재고수량

    public static void main(String[] args) {
        inltialize();
        user();
    }

    private static void user() {
        while (true) {
            System.out.println("=======================================================");
            System.out.println("자판기 입니다. (번호 : 상품(가격) - 재고");
            System.out.println("1.콜라(500W) - 3개 2.사이다(700W) - 3개 3.커피(1500W) - 3개");
            System.out.println("=======================================================");
            System.out.println("돈을 넣어주세요");
            scanner.next();
        }
    }
        private static void inltialize () {
            //콜라 정보
            product[0] = "콜라";
            price[0] = 500;
            stock[0] = 3;
            //사이다 정보
            product[1] = "사이다";
            price[1] = 700;
            stock[1] = 3;
            //커피 정보
            product[2] = "커피";
            price[2] = 1500;
            stock[2] = 3;
        }


}