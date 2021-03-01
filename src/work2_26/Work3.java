package work2_26;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:最短无序连续子数组
 * https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 * User: starry
 * Date: 2021 -02 -26
 * Time: 21:34
 */
public class Work3 {

    //正确版
    public int findUnsortedSubarray1(int[] nums) {
        int len = nums.length;
        int[] arr = Arrays.copyOf(nums,len);
        Arrays.sort(arr);
        int i = 0;
        int j = len-1;
        while(i < len) {
            if(arr[i] == nums[i]) {
                i++;
            }else {
                break;
            }
        }
        if(i == len) return 0;
        while(j >= 0) {
            if(arr[j] == nums[j]) {
                j--;
            }else {
                break;
            }
        }
        return j-i+1;
    }

    //[1,2,4,5,3]通过不了
    public int findUnsortedSubarray(int[] nums) {
        int i = 0;
        int len = nums.length;
        int max = nums[0];
        int min = nums[0];
        for(int a = 1; a < len; a++) {
            if(nums[a] > max) {
                max = nums[a];
            }
            if(nums[a] < min) {
                min = nums[a];
            }
        }
        int m = 0;
        if(nums[i] == min) {
            while(i < len-1) {
                if(nums[i] < nums[i+1]) {
                    i++;
                    m = i;
                }else if(nums[i] == nums[i+1]){
                    i++;
                }else {
                    break;
                }
            }
        }
        if(i == len-1) return 0;

        int j = len-1;
        int n = len-1;
        if(nums[j] == max) {
            while(j > 0) {
                if(nums[j] >= nums[j-1]) {
                    j--;
                    n = j;
                }else if(nums[j] == nums[j-1]){
                    j--;
                }else {
                    break;
                }
            }
        }
        return n-m+1;
    }

}
