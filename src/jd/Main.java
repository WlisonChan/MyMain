package jd;

import java.util.Scanner;

/**
 * 有一个含有n个数字的序列，每个数字的大小是不超过200的正整数，同时这个序列满足以下条件：
 * 1. a_1<=a_2
 * 2. a_n<=a_(n-1) （此时n>2）
 * 3. a_i<=max(a_{i-1},a_{i+1})
 * 但是很不幸的是，在序列保存的过程中，有些数字丢失了，请你根据上述条件，计算可能有多少种不同的序列可以满足以上条件。
 */
public class Main {
    private int c=10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int res = 1;
            if(nums[0] == 0){
                res*=nums[1];
            }
            if(nums[nums.length-1]==0){
                res*=nums[nums.length-2];
            }
        }
    }
}
