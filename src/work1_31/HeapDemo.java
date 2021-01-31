package work1_31;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 转变为大根堆
 * 假设长度为10，len就是10
 * 时间复杂度：O(logn)
 * User: starry
 * Date: 2021 -01 -31
 * Time: 16:18
 */
public class HeapDemo {

    public int[] elem;
    public int usedSize;

    public HeapDemo(){
        this.elem = new int[10];
    }

    public void adjustDown(int parent,int len) {
        int child = 2*parent+1;

        //child < len说明有左孩子
        while(child < len) {
            //child < len+1 判断是当前是否有右孩子
            if(child+1 < len && this.elem[child] < this.elem[child+1]) {
                child++;
            }
            //child 下标一定是左右孩子的最大值下标
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                //因为是从最后一棵树开始调整的 只要我们找到了这个
                //this.elem[child] < this.elem[child+1]  后续就不需要循环了
                //后面的都已经是大根堆了
                break;
            }
        }
    }

    public void adjustUp(int child) {
        int parent = (child-1)/2;

        while (child > 0) {
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }

    /**
     * 逻辑：放到数组的最后一个位置
     * 然后向上调整
     * @param val
     */
    public void push(int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;//

        adjustUp(this.usedSize-1);
    }

    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public void show() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i] +" ");
        }
    }

    public void creatBigHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //elem当中已经存放了元素

        for(int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    /**
     * 第一个和最后一个换
     * 向下调整0下标这棵树
     * @return
     */
    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }

        int ret = this.elem[0];
        //删除
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;    //9
        adjustDown(0,this.usedSize);
        return ret;
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return this.elem[0];
    }

    public static void main(String[] args) {
        HeapDemo heapDemo = new HeapDemo();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        System.out.println(Arrays.toString(array));
        heapDemo.creatBigHeap(array);
        heapDemo.show();
//        System.out.println();
//        heapDemo.push(100);
//        heapDemo.show();
        System.out.println();
        System.out.println(heapDemo.poll());
        heapDemo.show();
    }

    /**
     * 堆    优先级队列
     * 底层默认是一个小根堆
     * 每次存元素的时候，一定要保证数据进入堆后，依然可以维持一个小堆/大堆
     * 每次取出一个元素的时候，一定要保证，剩下的元素也要调整为一个小堆/大堆
     */

}
