package tencent;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Stack;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] chs = sc.nextLine().toCharArray();
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < chs.length; i++) {
                stack.push(String.valueOf(chs[i]));
                if (stack.peek().equals("]")) {
                    stack.pop();
                    StringBuffer sb = new StringBuffer();
                    while (!stack.peek().equals("|")) {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    String num = "";
                    while (!stack.peek().equals("[")) {
                        num += stack.pop();
                    }
                    stack.pop();
                    for (int j = 0; j < Integer.valueOf(num); j++) {
                        for (int k = sb.length()-1; k >=0; k--) {
                            stack.push(String.valueOf(sb.charAt(k)));
                        }
                    }
                }
            }
            String res = "";
            for(String temp : stack){
                res+=temp;
            }
            System.out.println(res);
        }
    }
}
