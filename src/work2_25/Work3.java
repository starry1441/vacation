package work2_25;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -25
 * Time: 19:06
 */
public class Work3 {

    public static void main(String[] args) {
//        String a = "abcdef";
//        String b = "cd";
//        System.out.println(a.indexOf(b,2));  //有，返回第一个字母下标 2
//        System.out.println(a.indexOf(b,3));  //从fromIndex往后找，没找到，返回-1
//
//        String c = "abababeee";
//        System.out.println(c.lastIndexOf("ab",3));    //从fromIndex往前，第一个ab在二号下标，返回2
//
//        String d = "beatuiful";
//        System.out.println(d.startsWith("atu",2));    //从toffset下标开始，是"atu"开头，返回true
//        System.out.println(d.endsWith("ful"));  //从后往前，最后是"ful"结尾，返回true
//
//        String f = "abababababcde";
//        String h = f.replaceFirst("ab", "hh");
//        System.out.println(h);  //只替换第一次出现的，返回hhababababcde
//
//        String str = "hello world hello xingxing" ;
//        String[] result = str.split(" ") ;  //按空格拆分
//        System.out.println(Arrays.toString(result));
//        String[] result1 = str.split(" ",3) ;
//        System.out.println(Arrays.toString(result1));

//        String str = "helloworld" ;
//        System.out.println(str.substring(5));   //world
//        System.out.println(str.substring(0, 5));    //hello

//        String str = "HELLO WORLD" ;
//        System.out.println(str.toLowerCase()); //hello world

        String a = "hello";
        System.out.println(a.length());
//        String b = "world";
//        System.out.println(a.concat(b));    //helloworld


//        String str1 = "";   //str1指向的对象为空
//        System.out.println(str1.isEmpty());  //true
//        String str2 = null; //str2为空
//        System.out.println(str2.isEmpty()); //空指针异常



        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        System.out.println(sb);
    }

}
