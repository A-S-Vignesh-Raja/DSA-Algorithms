import java.util.*;
class MergeSort {
    public static void main(String[] args) {
        int[] arr={8,9,3,1,6};
        int[] sortedArray=MergeSortRfn(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] MergeSortRfn(int[] arr){
        if(arr.length==1){
            return arr;
        }
        
        int mid=arr.length/2;
        int[] left=MergeSortRfn(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSortRfn(Arrays.copyOfRange(arr,mid,arr.length));
        return Merge(left,right);
    }
    public static int[] Merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
