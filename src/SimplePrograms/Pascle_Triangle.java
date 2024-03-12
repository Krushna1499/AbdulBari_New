package SimplePrograms;

import java.util.Scanner;

public class Pascle_Triangle {

	public static void main(String[] args) {
//		System.out.println("Enter the rows: ");
//		Scanner sc =new Scanner(System.in);
//		
		int n =5;
//		if(n<0)
//		{
//			n=n*-1;	
//		}
		for(int i=0;i<n;i++)   // i 0
		{
			for(int j=1;j<n-i;j++) { //for spaces
				System.out.print("");
			}
			//number
			int num = 1;
			for(int k=5;k>i;k--) {
				System.out.print("*"+" ");
//				num = num * (i-k)/(k+1);
			}
			System.out.println();
			
		}
		for(int i=0;i<n;i++)   // i 0
		{
			for(int j=1;j<n-i;j++) { //for spaces
				System.out.print("");
			}
			//number
			int num = 1;
			for(int k=0;k<=i;k++) {
				System.out.print("*"+" ");
//				num = num * (i-k)/(k+1);
			}
			System.out.println();

	}
}
}


