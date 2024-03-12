package Array;

public class TwoDArray {

	public static void main(String[] args) {
		int A[][]=new int[3][4];
		int B[][]= {{1,2,3},{2,4,6},{3,5,9},{4,8,1}};
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[0].length;j++)
			{
//				System.out.print(A.length+",");
//				System.out.println(A[0].length);
				System.out.print(B[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
