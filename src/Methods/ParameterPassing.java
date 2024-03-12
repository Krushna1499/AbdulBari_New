package Methods;

public class ParameterPassing {
	static void welcome(String n)
	{
		System.out.println("Welcome Mr."+n);
	}
	static int add(int x,int y) //formal parameter
	{
		int z;
		z=x+y;
		return z;
	}
	
	public static void main(String[] args) {
		String n="Victor";
		welcome(n); //method call
		int a=10,b=5,c;
		c=add(a,b);
		System.out.println(c);
		
		
	}

}
