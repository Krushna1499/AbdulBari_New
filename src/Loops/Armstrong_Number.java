package Loops;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int m=n;
		int sum =0;
		while(n>0)
		{
			int r = n%10;
			n=n/10;
			sum =sum +r*r*r;
		}
		if(m==sum) {
			System.out.println("This is Armstrong Number: "+sum);
		}
		else
		{
			System.out.println("This is not armstrong number");
		}
		
	}

}
