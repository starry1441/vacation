package work2_18;

/**
 * Created with IntelliJ IDEA.
 * Description:寻找数组的中心索引https://leetcode-cn.com/problems/find-pivot-index/
 * User: starry
 * Date: 2021 -02 -18
 * Time: 16:44
 */
public class Work2 {

    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            right = right+nums[i];
        }
        for(int i = 0; i < len; i++) {
            right = right-nums[i];
            if(left == right) {
                return i;
            }
            left = left+nums[i];
        }
        return -1;
    }

}
