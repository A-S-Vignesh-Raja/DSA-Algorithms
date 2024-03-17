import java.util.*;
public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	
	static void Cyclicsort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			//int correctindex=arr[i]-1; //range [1,n]
			int correctindex=arr[i]; range [0,n]
			if(arr[i]!=arr[correctindex]) {
				swap(arr,i,correctindex);
			}
			else {
				i++;
			}
		}
	}
	static void swap(int[] arr,int first, int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

}
