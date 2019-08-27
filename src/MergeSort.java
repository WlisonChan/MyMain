import java.util.Scanner;

public class MergeSort {

    public static int[] mergeSort(int[] a,int left,int right) {
        if(left<right){
            int mid = (right+left)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }
        return a;
    }

    public static void merge(int[] a,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right){
            if (a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i<=mid) temp[k++] = a[i++];
        while(j<=right) temp[k++] = a[j++];

        for(int y=0;y<temp.length;y++){
            a[y+left] = temp[y];
        }
    }


    public static void main(String[] args) {
        int[] a ={4,1,5,5,0,9};
        int[] res = MergeSort.mergeSort(a,0,5);
        for (int x:res
        ) {
            System.out.println(x);
        }

    }
}