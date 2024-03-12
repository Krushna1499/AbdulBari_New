package Loops;

import java.util.Scanner;

public class Multip {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
		}
	}

}