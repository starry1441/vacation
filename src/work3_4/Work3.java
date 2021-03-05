package work3_4;

/**
 * Created with IntelliJ IDEA.
 * Description:设计哈希集合
 * https://leetcode-cn.com/problems/design-hashset/
 * User: starry
 * Date: 2021 -03 -04
 * Time: 20:40
 */
class MyHashSet {

    /** Initialize your data structure here. */
    boolean[] map = new boolean[1000005];
    public MyHashSet() {

    }

    public void add(int key) {
        map[key] = true;
    }

    public void remove(int key) {
        map[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map[key] == true;
    }
}
