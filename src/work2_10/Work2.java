package work2_10;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:合并两个有序数组https://leetcode-cn.com/problems/merge-sorted-array/
 * User: starry
 * Date: 2021 -02 -10
 * Time: 16:02
 */
public class Work2 {

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m-n,n);
        Arrays.sort(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        int j = 0;
        while(j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Work2 a = new Work2();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        //System.arraycopy(nums2,0,nums1,3,3);
        a.merge(nums1,6,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
