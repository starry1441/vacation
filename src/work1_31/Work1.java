package work1_31;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:插入排序
 * 时间复杂度：
 * 最坏情况下：当数据是无序的情况下：O(n^2)
 * 最好情况下：当数据有序的情况下，可以到大O(n)
 *      所以结论：越有序越快。
 *      题目：当前有一组待排序列，但是这组待排序序列大部分是有序的。
 *          请问，下面哪个排序更适合       直接插入排序
 *          另外：直接插入排序一般也会用在一些排序的优化上。
 *              快速排序
 *  空间复杂度：
 *  稳定性：稳定的排序
 * User: starry
 * Date: 2021 -01 -31
 * Time: 12:18
 */
public class Work1 {

    public static void insertSort(int[] array) {

        for(int i = 1;i < array.length;i++){
            int tmp = array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            //if(j == -1){
                array[j+1] = tmp;
            //}
        }
    }

    public static void main(String[] args) {
        int[] array = {10,3,2,7,19,78,65,127};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }


}
