package Methods;

public class ReverseIntOrArray {
	
	int reverse(int n)
	{	int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
	int [] reverse(int A[])
	{
		int B[]=new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
	}
	public static void main(String[] args) {
		ReverseIntOrArray RT =new ReverseIntOrArray();
		System.out.println(RT.reverse(6547));
		
		System.out.println(RT.reverse(254));
	}

}
