import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		Arrays.sort(arr);
		int ans=binarysearch(arr,target);
		System.out.println(ans);
		
	}
	static int binarysearch(int[] arr, int target) {
		int start=0;
		int end=arr.length - 1;
		while(start<=end) {
			int mid=start + (end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}

