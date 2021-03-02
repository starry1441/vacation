package work3_2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:两个数组的交集https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * User: starry
 * Date: 2021 -03 -02
 * Time: 14:25
 */
public class Work3 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] isUsed = new int[nums2.length];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(result.contains(nums2[j])) {
                    continue;
                }else if(nums1[i] == nums2[j] && isUsed[j] == 0) {
                    result.add(nums2[j]);
                    isUsed[j] = 1;
                }
            }
        }
        int[] last = new int[result.size()];
        for(int i = 0; i < last.length; i++) {
            last[i] = result.get(i);
        }
        return last;
    }

}
