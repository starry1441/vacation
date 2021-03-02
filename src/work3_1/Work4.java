package work3_1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:颜色分类https://leetcode-cn.com/problems/sort-colors/
 * User: starry
 * Date: 2021 -03 -01
 * Time: 21:27
 */
public class Work4 {

    public static void sortColors(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int i = 0;
        int j = len-1;
        for(int k = 0; k < len; k++) {
            if(nums[k] == 0) {
                arr[i] = nums[k];
                i++;
            }else if(nums[k] == 2) {
                arr[j] = nums[k];
                j--;
            }
        }
        if(i < j) {
            while(i <= j) {
                arr[i] = 1;
                i++;
            }
        }
        for(int n = 0; n < len; n++) {
            nums[n] = arr[n];
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }



}
