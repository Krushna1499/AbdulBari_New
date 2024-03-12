package Methods;

public class Test2 {
	int max(int x,int y)
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
		int a=10,b=20;
		Test2 T=new Test2();
		System.out.println(T.max(a, b));
	}

}
//by creating object we can call the method 
// no need to make a method static. second way of calling the method