import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int i=0;
        int j=array.length-1;
        int target = array[j/2];
        while(i<j){
            if(array[i]!=target){
                i++;
            }
            if(array[j]!=target){
                j--;
            }
            if(array[i]==target && array[j]==target){
                break;
            }
        }
        return j-i+1>array.length/2?target:0;
    }
}
