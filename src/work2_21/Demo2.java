package work2_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 11:42
 */

interface IShape {
    public static final int age = 10;
    int age2 = 20;
    public abstract void draw();
//    void write();
}

class Flower1 implements IShape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Rect1 implements IShape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

public class Demo2 {
    public static void drawMap(IShape iShape) {
        iShape.draw();
    }

    public static void main(String[] args) {
        IShape iShape = new Flower1();
        drawMap(iShape);
        drawMap(new Rect1());
    }
}
