package AbstractClass;

abstract class Super
{
	public Super()
	{
		System.out.println("Super Constructor");
	}
	public void meth1()
	{
		System.out.println("Meth1 of super");
	}
	abstract public void meth2(); //abstarct method and class
}

class Sub extends Super
{
	@Override
	public void meth2()     //concreate method
	{
		System.out.println("Sub meth2");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Super s = new Sub();
		s.meth1();
		s.meth2();
	}

}
