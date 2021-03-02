package work2_15;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:第三大的数https://leetcode-cn.com/problems/third-maximum-number/
 * User: starry
 * Date: 2021 -02 -15
 * Time: 12:02
 */
public class Work1 {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        for(int i = nums.length-1; i > 0; i--) {
            if(nums[i] != nums[i-1]) {
                max++;
            }
            if(max == 3) {
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

}
