package work3_4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:下厨房
 * https://www.nowcoder.com/questionTerminal/ca5c9ba9ebac4fd5ae9ba46114b0f476
 * User: starry
 * Date: 2021 -03 -04
 * Time: 20:20
 */
public class Work1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while(cin.hasNextLine()) {
            String a = cin.nextLine();
            String[] b = a.split(" ");
            for(String s : b) {
                set.add(s);
            }
        }
        System.out.println(set.size());
    }

}
