package work2_25;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -25
 * Time: 10:23
 */
public class Work1 {


    public static void main(String[] args) {
//        String a = "AbcDe";
//        String b = "abcde";
//        System.out.println(a.equalsIgnoreCase(b));

        char[] value = {'h','e','l','l','o'};
        String a = new String(value,1,3);
        System.out.println(a);  //ell

        String b = "hello";
        char[] c = b.toCharArray();
        System.out.println(Arrays.toString(c)); //[h, e, l, l, o]
        System.out.println(b.charAt(1));    //e

//        byte[] d = {97,98,99,100};
//        String e = new String(d,1,2);
//        System.out.println(e);  //bc

        String f = "abcde";
        byte[] g = f.getBytes();
        System.out.println(Arrays.toString(g)); //[97, 98, 99, 100, 101]

        String h = "xing";
        try {
            byte[] bytes = h.getBytes("utf8");  //编码格式，还可以写gbk等
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();    //[97, 98, 99, 100, 101]
        }

    }

}
