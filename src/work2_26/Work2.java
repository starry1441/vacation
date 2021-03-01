package work2_26;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:压缩字符串
 *https://leetcode-cn.com/problems/string-compression/
 * User: starry
 * Date: 2021 -02 -26
 * Time: 17:20
 */
public class Work2 {

    public static int compress(char[] chars) {
        StringBuilder a = new StringBuilder();
        int i = 0;
        int count = 1;
        char[] arr = Arrays.copyOf(chars, chars.length+1);
        arr[arr.length-1] = '!';
        while(i < arr.length-1) {
            if(arr[i] == arr[i+1]) {
                count++;
            }else {
                a.append(arr[i]);
                if(count > 1){
                    a.append(count);
                }
                count = 1;
            }
            i++;
        }
        char[] newchars = a.toString().toCharArray();
        for(int j=0; j<newchars.length; j++) {
            chars[j] = newchars[j];
        }
        return newchars.length;
    }

    public static void main(String[] args) {
//        char[] a = {'a','b', 'c','d'};
//        a = Arrays.copyOf(a,a.length+1);
//        a[a.length-1] = '!';
//        System.out.println(Arrays.toString(a));
//        StringBuilder c = new StringBuilder();
//        c.append("adsfsdaf");
//        System.out.println(c.length());
        char[] a = {'a','a','b','b','c','c','c'};
        int b = compress(a);
        System.out.println(b);
    }
}
