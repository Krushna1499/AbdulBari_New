package Array;

import java.util.Scanner;

public class SearchingAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		int key;
		System.out.println("Enter a Key: ");
		key=sc.nextInt();
		
		for(int i=0;i<A.length;i++)
		{
		if(A[i]==key)
		{
		System.out.println("Element Found: "+i);
		System.exit(0);
		}
		}
		System.out.println("Not Found!");
	}

}
