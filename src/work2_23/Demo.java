package work2_23;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -23
 * Time: 19:44
 */
public class Demo {

    public static void main(String[] args) {
//        String str = "Hello";
//        String str2 = new String("Hello");
//        char[] array = {'H', 'e', 'l','l','o'};
//        String str3 = new String(array);
//
//        System.out.println(str == str2);
//        System.out.println(str == str3);
//        System.out.println(str2 == str3);

        String str1 = "abcde";

        String str2 = new String("abcde");
        System.out.println(str1 == str2);   //false

        String str3 = "abc" + "de"; //编译时 就进行了拼接，变为"abcde"
        System.out.println(str3 == str1);   //true

        String str4 = new String("abc") + new String("de");
        System.out.println(str1 == str4);   //false;

        String str5 = new String("abc") + "de";
        System.out.println(str5 == str1);   //false

        System.out.println(str4 == str5);   //false

        String a = new String("123");
        String b = "123";
        System.out.println(a.equals(b));
    }

}
