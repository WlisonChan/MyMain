package redbook;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int[] dp = new int[n];
            int[] res = new int[n];
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            res[0]=1;
            res[1]=1;
            for(int i=2; i<n; i++)
            {
                if (dp[i-1]>dp[i-2]+nums[i]){
                    dp[i]= dp[i-1];
                    res[i]=res[i-1];
                }else {
                    dp[i]=dp[i-2]+nums[i];
                    res[i] = res[i-2]+1;
                }
            }
            System.out.println(dp[n-1]+" "+res[n-1]);
        }
    }
}

