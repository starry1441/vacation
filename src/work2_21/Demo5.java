package work2_21;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 13:48
 */

class Student implements Comparable<Student>{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score) {
            return 1;
        }else if(this.score == o.score) {
            return 0;
        }else {
            return -1;
        }
    }
}

public class Demo5 {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("星星",21);
        students[1] = new Student("狒狒",12);
        students[2] = new Student("朵朵",23);
        System.out.println(Arrays.toString(students));
        System.out.println("============排序=============");
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

}
