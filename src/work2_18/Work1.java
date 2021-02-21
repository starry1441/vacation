package work2_18;

/**
 * Created with IntelliJ IDEA.
 * Description:按奇偶排序数组https://leetcode-cn.com/problems/sort-array-by-parity/
 * User: starry
 * Date: 2021 -02 -18
 * Time: 15:57
 */
public class Work1 {

    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int i = 0;
        int j = 0;
        int k = len-1;
        while(i < len) {
            if(A[i]%2 == 0) {
                B[j] = A[i];
                j++;
            }else {
                B[k] = A[i];
                k--;
            }
            i++;
        }
        return B;
    }

}
