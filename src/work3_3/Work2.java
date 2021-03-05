package work3_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -03 -03
 * Time: 18:53
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 2;
        arr.add(0);
        arr.add(1);
        while(true) {
            arr.add(arr.get(i-1)+arr.get(i-2));
            if(arr.get(i) > 1000000) break;
            i++;
        }
        int a = cin.nextInt();
        int j;
        for(j = 0; j < arr.size(); j++) {
            if(arr.get(j) > a) {
                break;
            }
        }
        int result = Math.min(arr.get(j)-a,a-arr.get(j-1));
        System.out.println(result);
    }

}
