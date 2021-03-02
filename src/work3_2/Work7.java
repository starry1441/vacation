package work3_2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -03 -02
 * Time: 16:37
 */
public class Work7 {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int len = queries.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < words.length; j++) {
                if(count(queries[i]) < count(words[j])){
                    result[i]++;
                }
            }
        }
        return result;
    }

    public int count(String a) {
        int[] buckets = new int[26];
        for(int i = 0; i < a.length(); i++) {
            buckets[a.charAt(i) - 'a']++;
        }
        int j;
        for(j = 0; j < buckets.length;j++) {
            if(buckets[j] != 0) {
                break;
            }
        }
        return buckets[j];
    }

    public static void main(String[] args) {
        String[] queries = {"cbd"};
        String[] words = {"zaaaz"};
        Work7 a = new Work7();
        int[] b = a.numSmallerByFrequency(queries,words);
        System.out.println(Arrays.toString(b));
    }

}
