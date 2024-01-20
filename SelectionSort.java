import java.util.*;
public class Selectionsort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int start=0;
			int maxindex=Maxindex(arr,start,last);
			swap(arr,maxindex,last);
		}
	}
	static void swap(int[] arr,int first, int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}
	static int Maxindex(int[] arr, int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
	

}
