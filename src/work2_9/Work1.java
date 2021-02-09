package work2_9;

/**
 * Created with IntelliJ IDEA.
 * Description:赎金信https://leetcode-cn.com/problems/ransom-note/
 * User: starry
 * Date: 2021 -02 -09
 * Time: 18:26
 */

public class Work1 {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        int len = mag.length;
        for(int i = 0; i < ran.length; i++) {
            int j;
            for(j = i; j < len; j++) {
                if(ran[i] == mag[j]) {
                    char tmp = mag[i];
                    mag[j] = mag[i];
                    mag[i] = tmp;
                    break;
                }
            }
            if(j == len) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Work1 a = new Work1();
        System.out.println(a.canConstruct("aa", "aab"));
    }

}
