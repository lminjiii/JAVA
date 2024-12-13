package basic.arrayTest;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] nums = new int[3]; /*nums 배열의 길이를 지정해주는 코드이며 배열들의 디폴트 값들은 0으로 지정된다.*/
        nums[0] = 4;
        nums[1] = 5;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

//        advanced for 구문
        for (int x : nums) {
            System.out.println(x);
        } /*nums에 들어가 있는 아이들이 int타입이니까 하나씩 꺼내서 집어 넣으라는 for문의 활용적인 for문이다.*/

    }
}
