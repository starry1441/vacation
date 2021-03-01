package work2_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 14:31
 */
class Money implements Cloneable{
    public double money = 12.8;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    public String name;
    public Money m = new Money();

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person2 = (Person)super.clone();
        person2.m = (Money)this.m.clone();
        return person2;
    }
}

public class Demo7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("星星");
        Person person2 = (Person) person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("============修改money=============");
        person2.m.money = 99.99;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
