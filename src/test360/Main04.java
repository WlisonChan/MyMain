package test360;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                Set<Integer> set = new HashSet<>();
                for (int j = start-1; j < end; j++) {
                    set.add(a[j]);
                }
                System.out.println(set.size());
            }
        }
    }
}
