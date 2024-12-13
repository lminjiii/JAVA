package basic.condition;

public class BreakCondition {
    public static void main(String[] args) {
        int result = 0;

//        1~10까지의 합 55

//        for (int i = 1; i <= 10; i++) {
//            result += i;
//            if (i == 5) {
//                break;
//            }
//        }

//        1~10까지의 합이지만 5를 패스하는 방법 50 continue

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            result = result + i;
//        }

//          return 은 아예 해당 for문을 빠져나오는거다. 그래서 출력값은 아무것도 없다.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return;
            }
            result = result + i;
        }
        System.out.println(result);
    }
}
