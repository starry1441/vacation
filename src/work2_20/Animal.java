package work2_20;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -20
 * Time: 11:49
 */
public class Animal {
    protected String name;
    public int age;

    public void eat() {
        System.out.println(this.name + "::eat()");
    }
}