package Methods;

public class PrimeNumber {
	static boolean prime(int n)
	{
		for(int i=2;i<=n/2;i++) // 1 is prime and that why we take divided by 2
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		System.out.println(prime(1));
	}

}
