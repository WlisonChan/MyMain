import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();
        int j2 = matrix[0].length-1;//列数-1
        int i2 = matrix.length-1;//行数-1
        int i1 = 0;
        int j1 = 0;
        while(i2>=i1 && j2>=j1){
            for(int i=j1;i<=j2;i++)al.add(matrix[i1][i]);
            for(int i=i1+1;i<=i2;i++)al.add(matrix[i][j2]);
            for(int i=j2-1;i>=j1;i--){
                if(i1!=i2) {
                    al.add(matrix[i2][i]);
                }
            }
            for(int i=i2-1;i>i1;i--)
                if(j1!=j2){
                    al.add(matrix[i][j1]);
                }
            i1++;i2--;j1++;j2--;
        }
        return al;
    }
}
