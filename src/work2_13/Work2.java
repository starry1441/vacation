package work2_13;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -13
 * Time: 11:44
 */
public class Work2 {

    public String reverseOnlyLetters(String S) {
        char[] m = S.toCharArray();
        int i = 0;
        int j = m.length-1;
        while(i < j) {
            if(isLetter(m[i]) && isLetter(m[j])) {
                char tmp = m[i];
                m[i] = m[j];
                m[j] = tmp;
                i++;
                j--;
                continue;
            }
            if(!isLetter(m[i]) && isLetter(m[j])) {
                i++;
                continue;
            }
            if(isLetter(m[i]) && !isLetter(m[j])) {
                j--;
                continue;
            }
            if(!isLetter(m[i]) && !isLetter(m[j])) {
                i++;
                j--;
            }
        }
        return new String(m);
    }
    public boolean isLetter(char a) {
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ab_cd";
        Work2 q = new Work2();
        q.reverseOnlyLetters(s);
    }

}
