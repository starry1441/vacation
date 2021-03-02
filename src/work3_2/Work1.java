package work3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:找到 K 个最接近的元素https://leetcode-cn.com/problems/find-k-closest-elements/
 * User: starry
 * Date: 2021 -03 -02
 * Time: 13:22
 */
public class Work1 {

    //聪明
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;

        int left = 0;
        int right = size - 1;

        int removeNums = size - k;
        while (removeNums > 0) {
            if (x - arr[left] <= arr[right] - x) {
                right--;
            } else {
                left++;
            }
            removeNums--;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }


    //笨
    public static List<Integer> findClosestElements1(int[] arr, int k, int x) {
        int len = arr.length;
        int[] sub = new int[len];
        for(int i = 0; i < len; i++) {
            sub[i] = Math.abs(arr[i]-x);
        }
        List<Integer> index = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            int min = sub[0];
            int j;
            int minIndex = 0;
            for(j = 1; j < len; j++) {
                if(min > sub[j]) {
                    min = sub[j];
                    minIndex = j;
                }
            }
            index.add(arr[minIndex]);
            sub[minIndex] = 10000;
        }
        Collections.sort(index);
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        List<Integer> index = findClosestElements(arr,k,x);
        System.out.println(index);
        ArrayList<String> list = new ArrayList();
        new ArrayList<Object>();
        new ArrayList<Number>();
    }

}
