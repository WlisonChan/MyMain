package test360two;

import java.util.Scanner;

/**
 * 沫璃发起了一场交易，她将她的5个朋友聚在一起准备进行一场交易。交易开始前，大家各有b(b>0)个硬币，交易后，每个人有ai个硬币。由于硬币不方面携带，在交易过程中可能会丢失。现在沫璃想知道是否一定丢失硬币，或者在可能没有丢失硬币的情况下，交易前每个人的硬币数b。沫璃只是组织者，不参与交易。
 *
 *
 * 输入描述:
 * 第一行一个数T(T<=100)，表示数据组数。
 *
 * 对于每组数据，第一行5个整数，第i个整数ai表示交易后第i个朋友的硬币数(0<=ai<=100)
 *
 * 输出描述:
 * 对于每组数据，输出一行，若一定丢失硬币输出-1，若可能没有丢失硬币，输出b。
 *
 * 输入例子1:
 * 2
 * 2 5 4 0 4
 * 4 5 9 2 1
 *
 * 输出例子1:
 * 3
 * -1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < 5; j++) {
                int num = sc.nextInt();
                sum+=num;
            }
            if(sum%5==0 && sum!=0){
                System.out.println(sum/5);
            }else {
                System.out.println("-1");
            }
        }
    }
}
