package work3_2;

/**
 * Created with IntelliJ IDEA.
 * Description:字符串中的第一个唯一字符https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * User: starry
 * Date: 2021 -03 -02
 * Time: 14:50
 */
public class Work4 {

    public static int firstUniqChar(String s) {
        char[] a = s.toCharArray();
        int i,j = 0;
        int len = a.length;
        if(len == 1) return 0;
        for(i = 0; i < len; i++) {
            if(i+1 < len) {
                j = i+1;
            }
            for(; j < len; j++) {
                if(a[i] == a[j]) {
                    break;
                }
            }
            if(j == len) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "z";
        System.out.println(firstUniqChar(s));
    }

}
