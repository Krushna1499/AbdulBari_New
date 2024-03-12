package Methods;

public class Sum_Num_Varargs {
	static int sum(int ...A)
	{
		int s=0;
		for(int i=0;i<A.length;i++)
		{
			s =A[i]+s;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2,2,4));
	}

}
