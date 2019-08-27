package test360;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 有一个城市需要修建，给你N个民居的坐标X,Y，问把这么多民居全都包进城市的话，城市所需最小面积是多少（注意，城市为平行于坐标轴的正方形）
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long minX = x,maxX= x;
            long minY = y,maxY= y;
            for(int i=1;i<n;i++){
                x=sc.nextLong();
                y=sc.nextLong();
                minX=x>minX?minX:x;
                maxX=x>maxX?x:maxX;
                minY=y>minY?minY:y;
                maxY=y>maxY?y:maxY;
            }
            long r = Math.max(maxX-minX,maxY-minY);
            BigInteger x1 = new BigInteger(String.valueOf(r));
            System.out.println(x1.multiply(x1).toString());
            System.out.println(r*r);
        }
    }
}
