package work2_11;

/**
 * Created with IntelliJ IDEA.
 * Description:长按键入https://leetcode-cn.com/problems/long-pressed-name/
 * User: starry
 * Date: 2021 -02 -11
 * Time: 14:27
 */
public class Work2 {

    public boolean isLongPressedName(String name, String typed) {
        int i = 0,j = 0;
        char tmp = 0;
        int lent = typed.length();
        int lenn = name.length();
        //name长度肯定要小于typed的
        if(lent < lenn) {
            return false;
        }
        //按顺序遍历两个字符串
        while (j < lent) {
            if(typed.charAt(j) == name.charAt(i)) {
                tmp = name.charAt(i);
            }else if(typed.charAt(j) == tmp) {
                i--;
            }else {
                return false;
            }
            if(i < lenn - 1) {
                i++;
            }
            j++;
        }
        //若是name有的字符没遍历  或者  遍历到了name最后一字符但typed没有这个字符
        if(i != lenn-1 || name.charAt(lenn-1) != typed.charAt(lent-1)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        String a = "hello";
//        System.out.println(a.charAt(0));
//        System.out.println(a.length());
        Work2 w = new Work2();
        System.out.println(w.isLongPressedName("vtkgn", "vttkgnn"));
    }

}
