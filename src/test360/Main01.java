package test360;

import java.util.Scanner;

/**
 * 圈地运动，就是用很多木棍摆在地上组成一个面积大于0的多边形～
 *
 * 小明喜欢圈地运动，于是他需要去小红店里面买一些木棍，期望圈出一块地来。小红想挑战一下小明，所以给小明设置了一些障碍。障碍分别是：
 *
 * 1.如果小明要买第i块木棍的话，他就必须把前i-1块木棍都买下来。
 *
 * 2.买了的木棍都必须用在圈地运动中。
 *
 * 那么请问小明最少买多少根木棍，才能使得木棍围成的图形是个面积大于0多边形呢？
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i]=sc.nextInt();
            }
            int sum=0;
            int max=num[0];
            for (int i = 1; i < num.length; i++) {
                if(num[i]>max){
                    sum+=max;
                    max=num[i];
                }else{
                    sum+=num[i];
                }
                if(sum>max){
                    System.out.println(i+1);
                    break;
                }
                if(i==num.length-1){
                    System.out.println("-1");
                }
            }
        }
    }
}
