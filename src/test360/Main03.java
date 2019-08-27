package test360;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int k = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                int[] num = new int[k];
                for (int j = l; j <= r; j++) {
                    char[] chs = Integer.toString(j, k).toCharArray();
                    for (int i1 = 0; i1 < chs.length; i1++) {
                        num[chs[i1]-'0']++;
                    }
                }
                Arrays.sort(num);
                System.out.println(num[num.length-1]);
            }
        }
    }
}
