package work2_20;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -20
 * Time: 11:07
 */

class Animal1 {
    public String name;
    public int age;
/*    //静态代码块
    static {
        System.out.println("Animal::static{}");
    }
    //实例代码块
    {
        System.out.println("Animal::{}");
    }
    public Animal1() {
        System.out.println("Animal()");
    }
    public Animal1(String name){
        System.out.println("Animal(String)");
    }*/
    public void eat() {
        System.out.println("Animal::eat()");
    }
}

class Dog extends Animal1{
    public int leg;
/*    static {
        System.out.println("Dog::static{}");
    }
    {
        System.out.println("Dog::{}");
    }
    public Dog() {
        super();
        System.out.println("Dog()");
    }
    public Dog(String name) {
        System.out.println("Dog(String)");
    }*/
    public void wangwang() {
        System.out.println("wangwang");
    }
    public void eat() {
        System.out.println("Dog::eat()");
    }
}

class Bird extends Animal1{
    static {
        System.out.println("Bird::static{}");
    }
    {
        System.out.println("Bird::{}");
    }
    public Bird() {
        System.out.println("Bird()");
    }
}

public class Test {

    public static void main(String[] args) {
        Animal1 animal1 = new Dog();
        animal1.eat();
    }

    public static void main1(String[] args) {
        Dog dog = new Dog();
        System.out.println("========");
        Bird bird = new Bird();
    }
}
