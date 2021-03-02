package work3_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:同构字符串https://leetcode-cn.com/problems/isomorphic-strings/
 * User: starry
 * Date: 2021 -03 -02
 * Time: 13:50
 */
public class Work2 {

    //正确
    public boolean isIsomorphic1(String s, String t) {
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }

    //错误
    public static boolean isIsomorphic(String s, String t) {
        String[] ta = t.split("");
        String[] sa = s.split("");
        int i = 0;
        String newS = s;
        while(i < ta.length) {
            newS = newS.replaceAll(sa[i],ta[i]);
            i++;
        }
        if(newS.equals(t)) return true;
        return false;
    }

    public static void main(String[] args) {
//        String a = "hello";
//        String[] b = a.split("");
//        System.out.println(Arrays.toString(b));
//        String c = a.replaceAll("l","o");
//        System.out.println(c);
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }

}
