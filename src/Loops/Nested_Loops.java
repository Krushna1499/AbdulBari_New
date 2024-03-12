package Loops;

public class Nested_Loops {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) //outer loop
//		{
//			for(int j=1;j<=5;j++) // inner loop
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
		// outer loop work on the row
		//inner loop work on the column
		//1 2 3 4 5  
		//1 2 3 4 5  
		//1 2 3 4 5  
		//1 2 3 4 5  
		//1 2 3 4 5 
		for(int i=1;i<=5;i++) //outer loop
		{
			for(int j=1;j<=5;j++) // inner loop
			{
				
				System.out.print(i+j+" ");
			}
			System.out.println(" ");
	}
//		1 1 1 1 1  
//		2 2 2 2 2  
//		3 3 3 3 3  
//		4 4 4 4 4  
//		5 5 5 5 5  

}
}
