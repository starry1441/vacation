package work2_8;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:主要元素https://leetcode-cn.com/problems/find-majority-element-lcci/
 * User: starry
 * Date: 2021 -02 -08
 * Time: 11:03
 */
public class Work2 {

    //暴力求解
    public int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = i; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }

    //优化
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length/2;
        for(int i = 0; i < nums.length/2+1; i++) {
            if(nums[i] == nums[i+j]) {
                return nums[i];
            }
        }
        return -1;
    }
}
