package work2_7;

/**
 * Created with IntelliJ IDEA.
 * Description:转换成小写字母https://leetcode-cn.com/problems/to-lower-case/submissions/
 * User: starry
 * Date: 2021 -02 -07
 * Time: 21:11
 */
public class Work1 {
    public String toLowerCase(String str) {
        if(str == null) return null;

        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char) (arr[i] + 32);
            }
        }

        return new String(arr);
    }

}
