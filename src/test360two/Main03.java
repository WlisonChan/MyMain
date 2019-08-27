package test360two;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 茉莉有2n匹马，每匹马都有一个速度v，现在茉莉将马分为两个队伍，每个队伍各有n匹马，两个队之间进行n场比赛，每场比赛两队各派出一匹马参赛，每匹马都恰好出场一次。茉莉想知道是否存在一种分配队伍的方法使得无论怎么安排比赛，第一个队伍都一定能获的全胜，两匹马若速度一样，那么速度快的获胜，若速度一样，则都有可能获胜。
 *
 *
 * 输入描述:
 * 第一行一个数T(T<=100)，表示数据组数。
 *
 * 对于每组数据，第一行一个整数n , (1<=n<=100)
 *
 * 接下来一行，2*n个整数，第i个整数vi表示第i匹马的速度, (1
 * <= vi <= 1000)
 *
 * 输出描述:
 * 对于每组数据，输出一行，若存在一种分配方法使得第一个队伍全胜输出YES，否则输出NO
 *
 * 输入例子1:
 * 2
 * 2
 * 1 2 3 4
 * 1
 * 1 1
 *
 * 输出例子1:
 * YES
 * NO
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int[] nums = new int[t*2];
            for (int j = 0; j < t*2; j++) {
                nums[j] = sc.nextInt();
            }
            Arrays.sort(nums);
            if(nums[t]>nums[t-1]){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
