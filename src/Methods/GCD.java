package Methods;

public class GCD { //gretest common divisor
	int gcd (int m,int n)
	{
		while(m!=n)
		{
			if(m>n)m=m-n;
			else n=n-m;
		}
		return m;
		
	}
	public static void main(String[] args) {
		GCD gc=new GCD();
		System.out.println(gc.gcd(25,15));
	}

}
