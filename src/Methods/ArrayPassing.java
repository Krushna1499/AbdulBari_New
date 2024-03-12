package Methods;

public class ArrayPassing {
	static void update(int A[])
	{
		A[0]=25;
		
	}

	public static void main(String[] args) {
		int A[] = {3,4,5,6};
		update(A);  //method call
		for(int i=0;i<A.length;i++)
		{
		
		System.out.print(A[i]+",");
	}
	}

}
