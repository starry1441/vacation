package work2_8;

/**
 * Created with IntelliJ IDEA.
 * Description:移除元素https://leetcode-cn.com/problems/remove-element/
 * User: starry
 * Date: 2021 -02 -08
 * Time: 14:32
 */
public class Work3 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == val) {
                for (int j = i+1; j < len; j++) {
                    nums[j-1] = nums[j];
                }
                len--;
                i = i-1;
            }
        }
        return len;
    }
}
