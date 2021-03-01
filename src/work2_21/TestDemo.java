package work2_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 10:02
 */

class Shape {
    public void draw() {

    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Cricle extends Shape {
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

public class TestDemo {

    public static void drawMap(Shape shape) {
        shape.draw();;
    }

    public static void main(String[] args) {
        Rect rect = new Rect();
        drawMap(rect);

        Cricle cricle = new Cricle();
        drawMap(cricle);

        Flower flower = new Flower();
        drawMap(flower);
    }

}
    