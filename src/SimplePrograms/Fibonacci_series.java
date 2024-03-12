package SimplePrograms;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		System.out.println("Enter the terms: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+","+b+",");
		for(int i=0;i<n-2;i++)
		{
			int c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
