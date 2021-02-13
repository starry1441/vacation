package work2_10;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:手撕顺序表
 * User: starry
 * Date: 2021 -02 -10
 * Time: 9:45
 */

public class MyArrayList {

    private int[] elem; //数组
    private int usedsize;   //有效数据个数

    public MyArrayList() {
        this.elem = new int[5];
    }

    public MyArrayList(int capacity) {
        this.elem = new int[capacity];
    }

    // 打印顺序表
    public void display() {
        for(int i = 0; i < usedsize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }

    //判断顺序表是否为满
    public boolean isFull() {
        return usedsize == elem.length;
    }

    //判断pos位置是否合法
    public boolean isPos(int pos) {
        if(pos < 0 || pos > usedsize) {
            return false;
        }
        return true;
    }

    //二倍扩容
    public void resize() {
        elem = Arrays.copyOf(elem,elem.length*2);
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {

        if(isFull()) {
            System.out.println("顺序表满了，自动为您扩容");
            resize();
        }

        if(isPos(pos)) {
             for(int i = usedsize; i > pos; i--) {
                 elem[i] = elem[i-1];
             }
             elem[pos] = data;
             usedsize++;
        }else {
            System.out.println("pos位置不合法");
        }
    }

    //默认插入到最后一个元素那里
    public void addLast(int data) {
        if (isFull()) {
            System.out.println("顺序表满了，自动为您扩容");
            resize();
        }
        elem[usedsize] = data;
        usedsize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0; i < usedsize; i++) {
            if(elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i = 0; i < usedsize; i++) {
            if(elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(isPos(pos)) {
            return elem[pos];
        }
        return -1;
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(isPos(pos)) {
            elem[pos] = value;
        }
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没有你想要删的数据");
            return;
        }
        for (int j = index; j < usedsize-1; j++) {
            elem[j] = elem[j+1];
        }
        usedsize--;
    }

    // 获取顺序表长度
    public int size() {
        return usedsize;
    }

    // 清空顺序表
    public void clear() {
        usedsize = 0;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.display();
        System.out.println("=======================");
        myArrayList.addLast(6);
        myArrayList.display();
        System.out.println("=======================");
        System.out.println(myArrayList.contains(3));
        System.out.println(myArrayList.contains(10));
        System.out.println("=======================");
        System.out.println(myArrayList.search(3));
        System.out.println(myArrayList.search(10));
        System.out.println("=======================");
        System.out.println(myArrayList.getPos(3));
        System.out.println(myArrayList.getPos(7));
        System.out.println("=======================");
        myArrayList.setPos(0,11);
        myArrayList.display();
        System.out.println("=======================");
        myArrayList.remove(11);
        myArrayList.display();
        myArrayList.remove(22);
        System.out.println("=======================");
        System.out.println(myArrayList.size());
        System.out.println("=======================");
        myArrayList.clear();
        System.out.println(myArrayList.size());
    }

}
