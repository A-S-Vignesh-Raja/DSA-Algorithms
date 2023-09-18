import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Insertionsort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}
	static void Insertionsort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
	}
	static void swap(int[] arr,int first, int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

}
