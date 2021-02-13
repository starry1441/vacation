package work2_11;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:存在重复元素https://leetcode-cn.com/problems/contains-duplicate/
 * User: starry
 * Date: 2021 -02 -11
 * Time: 14:13
 */
public class Work1 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

}
