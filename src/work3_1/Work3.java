package work3_1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:车队https://leetcode-cn.com/problems/car-fleet/
 * User: starry
 * Date: 2021 -03 -01
 * Time: 20:23
 */
public class Work3 {

    //题解
        public int carFleet1(int target, int[] position, int[] speed) {
            int N = position.length;
            Car[] cars = new Car[N];
            for (int i = 0; i < N; ++i)
                cars[i] = new Car(position[i], (double) (target - position[i]) / speed[i]);
            Arrays.sort(cars, (a, b) -> Integer.compare(a.position, b.position));

            int ans = 0, t = N;
            while (--t > 0) {
                if (cars[t].time < cars[t-1].time) ans++; //if cars[t] arrives sooner, it can't be caught
                else cars[t-1] = cars[t]; //else, cars[t-1] arrives at same time as cars[t]
            }

            return ans + (t == 0 ? 1 : 0); //lone car is fleet (if it exists)
        }


    class Car {
        int position;
        double time;
        Car(int p, double t) {
            position = p;
            time = t;
        }
    }


    //我是傻逼我是傻逼我是傻逼我是傻逼我是傻逼
    public int carFleet(int target, int[] position, int[] speed) {
        int time = 1;   //时间
        int len = position.length;  //数组长度
        int[] iscar = new int[len]; //是否此车已经组成车队    0：美足   1：组了
        int count = 0;
        while(true) {
            for(int i = 0; i < len; i++) {
                if(position[i] <= target) {
                    position[i] = position[i] + speed[i]*time;
                }
            }
            int car = 0;
            for(int i = 0; i < len; i++) {
                if(position[i] > target) {
                    if(iscar[i] == 0) count++;
                    car++;
                }
            }
            if(car == len) return count;
            for(int i = 0; i < len; i++) {
                for(int j = i+1; j < len; j++) {
                    if(position[i] == position[j] && (iscar[i]==0 && iscar[j]==0)) {
                        if (speed[i] > speed[j]) {
                            speed[i] = speed[j];
                        } else {
                            speed[j] = speed[i];
                        }
                        iscar[i] = 1;
                        iscar[j] = 1;
                        count++;
                    }
                }
            }
            time++;
        }
    }

    public static void main(String[] args) {
        int target = 10;
        int[] position = {2,4};
        int[] speed = {3,2};
        Work3 a = new Work3();
        System.out.println(a.carFleet(target, position, speed));
    }

}
