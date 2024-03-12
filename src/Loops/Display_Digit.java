package Loops;

import java.util.Scanner;

public class Display_Digit {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		while(n>0)
		{
			int r = n % 10;  // this is not a single fig its a eg. 257 its 7 5 2 separate
			n = n/10;
			System.out.println(r);
			 
		}
	}
}