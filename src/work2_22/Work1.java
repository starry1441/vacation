package work2_22;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -22
 * Time: 16:01
 */
public class Work1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("before");
        try {
            System.out.println(arr[100]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally 肯定会被执行！");
        }
        System.out.println("after");
    }
}
