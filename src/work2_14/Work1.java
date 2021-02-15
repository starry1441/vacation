package work2_14;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 加一https://leetcode-cn.com/problems/plus-one/
 * User: starry
 * Date: 2021 -02 -14
 * Time: 20:50
 */
public class Work1 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len-1;
        int j = 0;
        long sum = 0;
        while(i >= 0) {
            sum = sum + digits[i] * (long)Math.pow(10,j);
            j++;
            i--;
        }
        if(wei(sum) < wei(sum+1)) {
            digits = Arrays.copyOf(digits, len+1);
            len = len+1;
        }
        sum++;
        i = len-1;
        while(i >= 0) {
            digits[i] = (int)(sum % 10);
            sum = sum/10;
            i--;
        }
        return digits;
    }

    public int wei(long a) {
        int i = 0;
        if(a == 0) i = 1;
        while (a != 0) {
            a = a/10;
            i++;
        }
        return i;
    }


    public int[] plusOne1(int[] digits) {
        int len  = digits.length;
        int isNine = 0;
        int i = len-1;
        while(i >= 0) {
            if(digits[i] == 9 && isNine != 2) {
                isNine = 1;
                digits[i] = 0;
            }else {
                isNine = 2;
                digits[i] = digits[i] + 1;
                break;
            }
            i--;
        }
        if(i == -1) {
            digits = Arrays.copyOf(digits,len+1);
            for(int j = 1; j < digits.length; j++){
                digits[j] = digits[j-1];
            }
            digits[0] = 1;
        }

        return digits;
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    public int[] plusOne3(int[] digits) {
        int len  = digits.length;
        int isNine = 0;
        int i = len-1;
        while(i >= 0) {
            if(digits[i] == 9 && isNine != 2) {
                isNine = 1;
                digits[i] = 0;
            }else {
                isNine = 2;
                digits[i] = digits[i] + 1;
                return digits;
            }
            i--;
        }
        int[] tmp = new int[len+1];
        tmp[0] = 1;
        return tmp;
    }



    public static void main(String[] args) {
        int[] digits = {9};
        Work1 a = new Work1();
        int[] b = a.plusOne2(digits);
        System.out.println(Arrays.toString(b));
//        int[] digits = {9};
//        int i = -1;
//        if(i == -1) {
//            System.arraycopy(digits,0,digits,1,digits.length-1);
//
//        }
//        System.out.println(Arrays.toString(digits));
//
    }

}
