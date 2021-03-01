package work3_1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:比较版本号https://leetcode-cn.com/problems/compare-version-numbers/
 * User: starry
 * Date: 2021 -03 -01
 * Time: 17:45
 */
public class Work2 {

    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int lenA = a.length;
        int lenB = b.length;
        int i = 0;
        int A,B;
        if(lenA >= lenB) {
            b = Arrays.copyOf(b,lenA);
            for(int j = lenB; j < lenA; j++) {
                b[j] = "0";
            }
            while(i < lenA) {
                A = Integer.valueOf(a[i]);
                B = Integer.valueOf(b[i]);
                if(A > B) return 1;
                if(A < B) return -1;
                i++;
            }
        }else {
            a = Arrays.copyOf(a,lenB);
            for(int j = lenA; j < lenB; j++) {
                a[j] = "0";
            }
            while(i < lenB) {
                A = Integer.valueOf(a[i]);
                B = Integer.valueOf(b[i]);
                if(A > B) return 1;
                if(A < B) return -1;
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String a = "1.0";
        String b = "1.0.0";
        Work2 xing = new Work2();
        System.out.println(xing.compareVersion(a, b));

    }

}
