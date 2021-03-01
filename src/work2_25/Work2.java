package work2_25;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -25
 * Time: 11:31
 */
public class Work2 {

    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        System.out.println(a.compareTo(b)); //a == b 返回 0
        String c = "abcde";
        String d = "abcd";
        System.out.println(c.compareTo(d)); //a > b  返回大于0的数，此例子返回1
        String e = "abcd";
        String f = "abcdfg";
        System.out.println(e.compareTo(f)); //a < b  返回小于0的数，此例子为-2

//        System.out.println(a.equalsIgnoreCase(b));  //true
//
//        System.out.println(a.equals(b));    //true
    }

}
