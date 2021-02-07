package work2_7;

/**
 * Created with IntelliJ IDEA.
 * Description:旋转数组https://leetcode-cn.com/problems/rotate-array/
 * User: starry
 * Date: 2021 -02 -07
 * Time: 21:46
 */
public class Work2 {

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        for(int i = 0;i < k;i++) {
            int tmp = nums[len-1];
            for(int j = len-1;j > 0;j--) {

                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
    }

}
