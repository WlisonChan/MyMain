package tencent;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int res =1;
                int maxLeft=0,maxRight=0;
                for (int j = i+1; j < n; j++) {
                    if(nums[j]>maxRight){
                        res++;
                        maxRight=nums[j];
                    }
                }
                for (int k = i-1; k >= 0; k--) {
                    if(nums[k]>maxLeft){
                        res++;
                        maxLeft=nums[k];
                    }
                }
                System.out.print(res);
                if(i!=n-1){
                    System.out.print(" ");
                }
            }
        }
    }
}