package basic.arrayTest;

import java.util.Arrays;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
//      System.out.println(nums[3]);  -->> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3   length가 3이라서 0,1,2 밖에 없기 때문에 3의 자리는 없기 때문에 예외가 뜨는것이다.
        System.out.println(Arrays.toString(nums)); /*모든 배열을 나오게 하는 Arrays 클래스의 toString 행동 ()에 있는건 변수의 이름을 넣는다.*/

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
