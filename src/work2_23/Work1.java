package work2_23;

/**
 * Created with IntelliJ IDEA.
 * Description:在排序数组中查找元素的第一个和最后一个位置
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * User: starry
 * Date: 2021 -02 -23
 * Time: 18:36
 */
public class Work1 {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = i;
        int len = nums.length;
        int[] arr = new int[2];
        while(i < len && j < len) {
            if(nums[i] == target) {
                if(nums[j] == target) {
                    j++;
                }else {
                    break;
                }
            }else {
                i++;
                j = i;
            }
        }
        if(i == len) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        arr[1] = j-1;
        arr[0] = i;
        return arr;
    }
}