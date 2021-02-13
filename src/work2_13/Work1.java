package work2_13;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -13
 * Time: 11:09
 */
public class Work1 {

    public int[] sortedSquares(int[] nums) {
        for (int i= 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;


    }

}
