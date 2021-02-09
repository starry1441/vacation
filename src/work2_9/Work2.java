package work2_9;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:回文数https://leetcode-cn.com/problems/palindrome-number/
 * User: starry
 * Date: 2021 -02 -09
 * Time: 20:13
 */
public class Work2 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int count = 0;
        while (y != 0) {
            y = y/10;
            count++;
        }
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = x%10;
            x = x/10;
        }
        int i = 0;
        int j = count-1;
        while (i < j) {
            if(arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Work2 b = new Work2();
        System.out.println(b.isPalindrome(121));
    }
}
