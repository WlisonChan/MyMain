package test360two;

import java.util.Scanner;

/**
 * 有K种不同的玫瑰花，现在要摆放在N个位置上，要求每种颜色的花至少出现过一次，请问有多少种不同的方案数呢？，
 * 因为答案可能很大，你只需要输出它对772235取余后的结果.
 *
 *
 * 输入描述:
 * 输入只有1行，分别有两个整数N,K( 1 <= N <= 50000 , 1 <= K <= 30 )
 *
 * 输出描述:
 * 输出一行表示答案
 *
 * 输入例子1:
 * 3 2
 *
 * 输出例子1:
 * 6
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long res =0;
            int t =1;
            long sum =1;
            for (int i = n; i >0; i--) {
                System.out.println(sum);
                sum*=i;
                sum%=772235;
                if(t==k){
                    res+=sum;
                    sum=1;
                    t=1;
                }
                t++;
            }
            System.out.println(res-1);
        }
    }
}
