package Methods;

public class Discount_Vargrs {
	static double sum(double ...P)
	{
		double sum=0;
		for(int i=0;i<P.length;i++)
		{
			sum +=P[i];
		}
		if(sum<500)
			return sum*0.05;
		else if(sum>=500 && sum<1000)
		return sum*0.10;
		else return sum*0.20;
	}
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(200));
		System.out.println(sum(100,200,300));
	}

}
