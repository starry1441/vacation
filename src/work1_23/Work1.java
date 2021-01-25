package work1_23;

/**
 * Created with IntelliJ IDEA.
 * Description:给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * 形式上，如果可以找出索引 i+1 < j 且满足 A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1] 就可以将数组三等分。
 * 示例 1：
 * 输入：[0,2,1,-6,6,-7,9,1,2,0,1]
 * 输出：true
 * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
 * User: starry
 * Date: 2021 -01 -23
 * Time: 9:18
 */
public class Work1 {

    public boolean canThreePartsEqualSum(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int A=0;
                for(int a=0;a<i;a++){
                    A +=arr[a];
                }
                int B=0;
                for(int b=i;b<j;b++){
                    B +=arr[b];
                }
                int C=0;
                for(int c=j;c<arr.length;c++){
                    C +=arr[c];
                }
                if(A==B && A==C && B==C){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean canThreePartsEqualSum1(int[] A) {
        int sum = 0;
        for(int i : A){
            sum += i;
        }
        if(sum%3 != 0){
            // 总和不是3的倍数，直接返回false
            return false;
        }

        // 使用双指针,从数组两头开始一起找，节约时间
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];

        // 使用left + 1 < right 的原因，防止只能将数组分成两个部分
        // 例如：[1,-1,1,-1]，使用left < right作为判断条件就会出错
        while(left + 1 < right){
            if(leftSum == sum/3 && rightSum == sum/3){
                // 左右两边都等于 sum/3 ，中间也一定等于
                return true;
            }
            if(leftSum != sum/3){
                // left = 0赋予了初值，应该先left++，在leftSum += A[left];
                leftSum += A[++left];
            }
            if(rightSum != sum/3){
                // right = A.length - 1 赋予了初值，应该先right--，在rightSum += A[right];
                rightSum += A[--right];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {18,12,-18,18,-19,-1,10,10};
        Work1 a = new Work1();
        boolean boo = a.canThreePartsEqualSum(arr);
        System.out.println(boo);
        boolean boo1 = a.canThreePartsEqualSum1(arr);
        System.out.println(boo1);
    }

}
