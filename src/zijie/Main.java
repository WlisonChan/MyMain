package zijie;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        while(sc.hasNext()){
//            String str = sc.nextLine();
//            String[] strs = str.split("[a-z,A-Z]+");
//            for (int i = 0; i < strs.length; i++) {
//                System.out.println(strs[i]);
//            }
//        }
//    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    while(sc.hasNext()){
        String str = sc.nextLine();
        Pattern compile = Pattern.compile("^[-]\\d+");
        Matcher matcher = compile.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
}
