package work2_26;

/**
 * Created with IntelliJ IDEA.
 * Description:验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/
 * User: starry
 * Date: 2021 -02 -26
 * Time: 16:10
 */
public class Work1 {
    public boolean isPalindrome(String s) {
        StringBuilder a = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] >= '0' && c[i] <='9') {
                a.append(c[i]);
            }
        }
        int i = 0;
        int j = a.length()-1;
        while(i < j) {
            if((a.charAt(i)+"").equalsIgnoreCase(a.charAt(j)+"")) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
        StringBuilder a = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] >= '0' && c[i] <='9') {
                a.append(c[i]);
            }
        }
        int len = a.length();
        String begin = new String();
        String last1 = new String();
        if(len % 2 == 1) {
            begin = a.substring(0,len/2);
            last1 = a.substring(len/2+1,a.length());
        }else {
            begin = a.substring(0,len/2);
            last1 = a.substring(len/2,a.length());
        }
        String last = reverse(last1);
        return begin.equalsIgnoreCase(last);
    }

    public String reverse(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length-1;
        while(i < j) {
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return new String(a);
    }

    public boolean isPalindrome2(String s) {
        StringBuilder a = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] >= '0' && c[i] <='9') {
                a.append(c[i]);
            }
        }
        int len = a.length();
        String begin = a.substring(0,len/2);
        StringBuilder last = new StringBuilder();
        if(len%2 == 1) {
            last.append(a.substring(len/2+1, len));
        }else {
            last.append(a.substring(len/2, len));
        }
        last.reverse();
        String last1 = last.toString();
        return begin.equalsIgnoreCase(last1);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Work1 w = new Work1();
        System.out.println(w.isPalindrome2(s));
    }
}
