package work3_4;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:设计哈希映射
 * https://leetcode-cn.com/problems/design-hashmap/
 * User: starry
 * Date: 2021 -03 -04
 * Time: 20:35
 */
class MyHashMap {

    Integer[] arr = new Integer[1000001];

    /** Initialize your data structure here. */
    public MyHashMap() {

    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        arr[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return arr[key]==null? -1: arr[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        arr[key] = null;
    }

}

public class Work2 {
    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        System.out.println(Arrays.toString(a));
        int[] b = new int[10];
        System.out.println(Arrays.toString(b));
    }
}
