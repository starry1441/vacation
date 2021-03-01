package work2_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 10:37
 */

abstract class Shape1 {
    public abstract void draw();
}

class Cricle1 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}

public class Demo {
    public static void drawMap(Shape1 shape1) {
        shape1.draw();;
    }
    public static void main(String[] args) {
        Cricle1 cricle1 = new Cricle1();
        drawMap(cricle1);
    }
}
