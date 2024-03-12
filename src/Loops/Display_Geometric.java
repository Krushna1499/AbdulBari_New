package Loops;

import java.util.Scanner;

public class Display_Geometric {

	public static void main(String[] args) {
		System.out.println("Enter the strating Number: ");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Enter the multiple: ");
		int m =sc.nextInt();
		System.out.println("Enter the no.of cycles: ");
		int n =sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term=term*m;
			
			
		}
	}

}
