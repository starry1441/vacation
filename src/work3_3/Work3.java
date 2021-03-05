package work3_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -03 -03
 * Time: 19:53
 */
public class Work3 {

    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        String a = null;
//        while (cin.hasNextLine()) {
//            a = cin.nextLine();
//        }
        String a = "BUTTER FLOUR\n" +
                "HONEY FLOUR EGG";
        assert a != null;
        String[] b = a.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String s : b) {
            if(map.containsKey(s)) {
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map.size());
    }

}
