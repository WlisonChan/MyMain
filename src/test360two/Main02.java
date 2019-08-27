package test360two;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 沫璃邀请她的朋友参加周末的派对。沫璃买了3种颜色的气球，现在她要有这些气球来装饰餐桌，每个餐桌只用恰好3个气球装饰，要求3个气球的颜色不能完全一样，可以是2种或者3种颜色。沫璃想知道这些气球最多能装饰多少张餐桌。
 *
 *
 * 输入描述:
 * 第一行一个数T(T<=100)，表示数据组数。
 *
 * 对于每组数据，第一行3个整数r，g，b，分别表示三种颜色的气球个数(0<=r, g, b<=2*10^9)
 *
 * 输出描述:
 * 对于每组数据，输出一行，一个整数表示最多能装饰的餐桌数量。
 *
 * 输入例子1:
 * 2
 * 5 4 3
 * 2 3 3
 *
 * 输出例子1:
 * 4
 * 2
 * 通过率50%
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long[] num = new long[3];
            for (int j = 0; j < 3; j++) {
                num[j] = sc.nextLong();
            }
            Arrays.sort(num);
            if(num[2]/2>=num[0]+num[1]){
                System.out.println(num[0]+num[1]);
            }else
                System.out.println((num[0]+num[1]+num[2])/3);
        }
    }
}
