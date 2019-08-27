package tencent;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int[][] xy= new int[n][2];
            for (int i = 0; i < n; i++) {
                xy[i][0]=sc.nextInt();
                xy[i][1]=sc.nextInt();
            }
        }
    }
}
