package Loops;

import java.util.Scanner;

public class Display_ArithmP {

	public static void main(String[] args) {
		System.out.println("Enter the strating Number: ");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Enter the Difference: ");
		int d =sc.nextInt();
		System.out.println("Enter the no.of cycles: ");
		int n =sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++)
		{
//			int ap=a+d*i;
			System.out.print(term+",");
			term=term+d;
//			System.out.println("Arithmetic series is: "+term);
		}

}
}