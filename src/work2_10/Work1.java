package work2_10;

/**
 * Created with IntelliJ IDEA.
 * Description:最后一个单词的长度https://leetcode-cn.com/problems/length-of-last-word/
 * User: starry
 * Date: 2021 -02 -10
 * Time: 14:59
 */
public class Work1 {

    //笨办法
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        int i;
        int j;
        int len = arr.length;
        int kong = 0;
        for(j = 0; j < len; j++) {
            if(arr[j] != ' '){
                break;
            }
        }
        if(j == len) return 0;
        if (arr[len-1] == ' ') {
            for(int k = len-1;k >= 0; k--) {
                if(arr[k] == ' ') {
                    count--;
                }
                if(arr[k] != ' ') break;
            }
        }
        for (i = len-1; i >= 0; i--) {
            if (arr[i] != ' ') kong = 1;
            if(arr[i] == ' ' && kong == 1) {
                return count;
            }
            count++;
        }
        if(i == -1) {
            return count;
        }
        return 0;
    }

    //优化后
    public int lengthOfLastWord2(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }

}
