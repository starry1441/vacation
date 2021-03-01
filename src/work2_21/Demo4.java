package work2_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 12:15
 */

interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "游");
    }
}

class Duck extends Animal implements IRunning,ISwimming,IFlying {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "飞");
    }
    @Override
    public void run() {
        System.out.println(this.name + "跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "游");
    }
}

public class Demo4 {
    public static void goRun(IRunning iRunning) {
        iRunning.run();
    }
    public static void goFly(IFlying iFlying) {
        iFlying.fly();
    }
    public static void goSwim(ISwimming iSwimming) {
        iSwimming.swim();
    }
    public static void main(String[] args) {
//        IRunning iRunning = new Duck("唐老鸭");
//        iRunning.run();
//        IFlying iFlying = new Duck("唐老鸭");
//        iFlying.fly();
//        ISwimming iSwimming = new Duck("唐老鸭");
//        iSwimming.swim();
        Duck duck = new Duck("唐老鸭");
        goRun(duck);
        goFly(duck);
        goSwim(duck);
    }
}
