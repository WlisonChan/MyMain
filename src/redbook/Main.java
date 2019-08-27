package redbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split("\\s+");
            String res = "";
            for (int i = strs.length-1; i >=0; i--) {
                res+=strs[i];
                if(i!=0){
                    res+=" ";
                }
            }
            System.out.println(res);
        }
    }
}
