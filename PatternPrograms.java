

import java.util.Scanner;

public class Patterns {
	
	static void HalfTriangle(int n) {
		for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	static void HalfRhombus(int n) {
		for(int i=0;i<2*n;i++){
            int cols= i>n?2*n-i:i;
            for(int j=1;j<=cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	static void Pyramid(int n) {
		for(int i=0;i<n;i++){
            int space=n-i;
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	static void Rhombus(int n) {
		for(int i=0;i<2*n;i++){
            int cols= i>n?2*n-i:i;
            int space=n-cols;
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	static void SpiralMatrix(int n) {
		for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int index=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(index+" ");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HalfTriangle(n);
		HalfRhombus(n);
		Rhombus(n);
		Pyramid(n);
		SpiralMatrix(n);

	}

}
