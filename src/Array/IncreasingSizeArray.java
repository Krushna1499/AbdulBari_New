package Array;

public class IncreasingSizeArray {

	public static void main(String[] args) {
		int A[]= {8,6,10,9,2};
		System.out.println("Length Of A: "+A.length);
		int B[]=new int[2*A.length];
		for(int i=0;i<A.length;i++)
		{
			A[i]=B[i];
			
		}
		A=B;
			System.out.println("length of B: "+B.length);
		
	}

}
