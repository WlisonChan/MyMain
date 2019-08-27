package tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小Q今天在上厕所时想到了这个问题：有n个数，两两组成二元组，相差最小的有多少对呢？相差最大呢？
 * 输入描述:
 *
 *  输入包含多组测试数据。
 *
 *  对于每组测试数据：
 *
 *  N - 本组测试数据有n个数
 *
 *  a1,a2...an - 需要计算的数据
 *
 *  保证:
 *
 *  1<=N<=100000,0<=ai<=INT_MAX.
 *
 *
 *
 * 输出描述:
 *
 * 对于每组数据，输出两个数，第一个数表示差最小的对数，第二个数表示差最大的对数。
 *
 *
 * 输入例子1:
 * 6
 * 45 12 45 32 5 6
 *
 * 输出例子1:
 * 1 2
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int min=Math.abs(nums[0]-nums[1]);
            int max=Math.abs(nums[0]-nums[1]);
            int numMin = 1;
            int numMax = 1;
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    int sub = Math.abs(nums[i]-nums[j]);
                    if(sub<min){
                        numMin=1;
                        min=sub;
                    }else if(min==sub){
                        numMin++;
                    }
                    if(sub>max){
                        numMax=1;
                        max=sub;
                    }else if(max==sub){
                        numMax++;
                    }
                }
            }
            System.out.println(numMin+" "+numMax);
        }
    }
}*/
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int min = nums[1]-nums[0];
        int numMin=1;
        for (int i = 1; i < nums.length-1; i++) {
            int sub = nums[i+1] - nums[i];
            if(min == sub){
                numMin++;
            }else if(sub<min){
                min=sub;
                numMin=1;
                System.out.println("replace");
            }
            System.out.println(numMin);
        }
        int a=1;
        int b=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[0]){
                a++;
            }else {
                break;
            }
        }
        for (int i = nums.length-2; i >0; i--) {
            if(nums[i]==nums[nums.length-1]){
                b++;
            }else {
                break;
            }
        }
        int numMax = a*b;
        System.out.println(numMin+" "+numMax);
    }
}
