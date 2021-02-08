package work2_8;

/**
 * Created with IntelliJ IDEA.
 * Description:两数之和https://leetcode-cn.com/problems/two-sum/
 * User: starry
 * Date: 2021 -02 -08
 * Time: 10:49
 */
public class Work1 {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null) return null;
        for(int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if(tmp + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
