import work2_20.Animal;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -07
 * Time: 17:36
 */





class Person {
    private String name;
    private int age;
    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }
    //重写Object的toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main extends Animal{
    public static void main1(String[] args) {
        Person person = new Person("caocao",19);
        person.show();
        System.out.println(person);
    }


    void func1(int N){
        int count = 0;
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N ; j++) {
                count++;
            }
        }
        for (int k = 0; k < 2 * N ; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }

    int binarySearch(int[] array, int value) {
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end) {
            int mid = begin + ((end-begin) / 2);
            if (array[mid] < value)
                begin = mid + 1;
            else if (array[mid] > value)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public void loop() {
        int a = 1;

    }

    public void func() {
        Animal animal = new Animal();
        System.out.println(super.name);
    }

    public static void main(String[] args) {

    }




}




//
//
//class Person {
//    public int age;             //成员属性 实例变量  字段  属性
//    public String name;
//    public static String sex;   //静态成员变量    方法区
//    public void eat() {//成员方法
//        System.out.println("吃饭!");
//    }
//    public void sleep() {
//        System.out.println("睡觉!");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "星星";
//        person1.age = 20;
//
//        Person person2 = new Person();
//        person2.name = "狒狒";
//        person2.age = 40;
//    }
//}







class Test {






    public static void main6(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for (int[] arr : array) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        String ret = Arrays.deepToString(array);
        System.out.println(ret);
    }


    public static void main3(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        //array2指向了刚刚生成的那个副本
        int[] array2 = array1.clone();
        System.out.println("=====================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static void main2(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.arraycopy(array1,0,array2,0,array1.length);
        System.out.println("=====================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static void main1(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = Arrays.copyOf(array1,array1.length);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("=====================");
        array2[0] = 99;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));




//        int[] array2 = new int[array1.length];
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        for(int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//        }
//        System.out.println("=====================");
//        array2[0] = 99;
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
    }
}
