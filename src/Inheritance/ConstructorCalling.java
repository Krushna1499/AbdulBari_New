package Inheritance;

class parent
{
	parent()
	{
		System.out.println("Parent called");
		
	}
	parent(int x)
	{
		System.out.println("Parent with parametrizesd");
	}
}

class child extends parent
{
	child()
	{
		System.out.println("child calleed");
	}
	child(int x)
	{
		
		System.out.println("parameter");
	}
}
public class ConstructorCalling {

	public static void main(String[] args) {
	
		
		child c=new child(20);
	}

}
