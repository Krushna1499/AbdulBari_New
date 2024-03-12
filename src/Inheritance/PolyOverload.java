package Inheritance;

class Test
{
	public int max(int a,int b) //overloading
	{
		return a>b?a:b;
	}
	public int max(int a,int b,int c) //poly same method but different operations or forms
	{
		if(a>b && a>c) return a;
		else if(b>c) return b;
		return c;
	}
}
public class PolyOverload {

	public static void main(String[] args) {
		Test t =new Test();
		System.out.println(t.max(10, 5));
		System.out.println(t.max(10, 60, 100)); //compile time polymorphism 
	}

}
