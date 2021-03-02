package work3_2;

/**
 * Created with IntelliJ IDEA.
 * Description:字符串中的第一个唯一字符https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * User: starry
 * Date: 2021 -03 -02
 * Time: 15:55
 */
public class Work5 {

    public static int firstUniqChar(String s) {
        int[] buckets = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            buckets[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (buckets[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "bovebeetcode";
        System.out.println(firstUniqChar(s));
    }

}
