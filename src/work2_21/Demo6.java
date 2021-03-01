package work2_21;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 14:05
 */
class Student1{
    public String name;
    public int score;

    public Student1(String name, int score) {
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
}

public class Demo6 {

    public static void main(String[] args) {
        Student1[] students = new Student1[3];
        students[0] = new Student1("星星",21);
        students[1] = new Student1("狒狒",12);
        students[2] = new Student1("朵朵",23);
        System.out.println(Arrays.toString(students));
        System.out.println("============根据分数排序=============");
        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(students, scoreComparator);
        System.out.println(Arrays.toString(students));
        System.out.println("============根据姓名排序=============");
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(students, nameComparator);
        System.out.println(Arrays.toString(students));
    }

}