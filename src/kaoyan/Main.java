package kaoyan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int sort = sc.nextInt();
            Object[][] score = new Object[n][2];
            for (int i = 0; i < n; i++) {
                score[i][0] = sc.next();
                score[i][1] = Integer.valueOf(sc.next());
            }
            if(sort==1) {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if ((int) score[j][1] > (int) score[j + 1][1]) {
                            Object t1 = score[j][1];
                            Object t2 = score[j][0];
                            score[j][1] = score[j + 1][1];
                            score[j][0] = score[j + 1][0];
                            score[j + 1][1] = t1;
                            score[j + 1][0] = t2;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(score[i][0] + " " + score[i][1]);
                }
            }else{
                for (int i = 0; i < n - 1; i++) {
                    for (int j = n-1; j> 0 ; j--) {
                        if ((int) score[j][1] > (int) score[j - 1][1]) {
                            Object t1 = score[j][1];
                            Object t2 = score[j][0];
                            score[j][1] = score[j - 1][1];
                            score[j][0] = score[j - 1][0];
                            score[j - 1][1] = t1;
                            score[j - 1][0] = t2;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(score[i][0] + " " + score[i][1]);
                }
            }
        }

    }
}
