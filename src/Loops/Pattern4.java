package Loops;

public class Pattern4 {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++)
//		{
//			
//			for(int j=1;j<=i ;j++)
//			{
//				if(i<=j) {
//					System.out.print(("*") );
//				}
//				else {
//				System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5 ;j++)
			{
				for(int k=0 ;k<=3;k++)
				{
					System.out.print("*");
				}
				if(i+j>5) {
					System.out.print(("*") );
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}


