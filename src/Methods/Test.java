package Methods;

public class Test {
	static int max(int x,int y) //method
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void main(String[] args) {
		
		int a =10,b=15,c;
		c=max(a,b); //calling a method
		
		System.out.println(c); 
	}

}
