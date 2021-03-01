package work2_22;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -22
 * Time: 16:26
 */

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}


public class Demo {

    //声明异常
    public static void func(int y) throws ArithmeticException{
        if(y == 0) {
            //抛出异常
            throw new ArithmeticException();
        }
        System.out.println(10/y);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("我定义的异常");
        }catch (MyException e) {
            e.printStackTrace();
        }
    }
}
