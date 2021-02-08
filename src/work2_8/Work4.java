package work2_8;

/**
 * Created with IntelliJ IDEA.
 * Description:搜索插入位置https://leetcode-cn.com/problems/search-insert-position/
 * User: starry
 * Date: 2021 -02 -08
 * Time: 15:02
 */
public class Work4 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<target) {
                continue;
            }else if(nums[i]>target) {
                return i;
            }else {
                return i;
            }
        }
        return nums.length-1;
    }
}
