package work3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:子集https://leetcode-cn.com/problems/subsets/
 * User: starry
 * Date: 2021 -03 -01
 * Time: 16:39
 */
public class Work1 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Work1 a = new Work1();
        a.subsets(arr);
    }

}
