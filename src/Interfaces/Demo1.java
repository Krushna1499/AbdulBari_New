package Interfaces;

interface test1
{
	void meth1();
	void meth2();
	
}

class My implements test1 //interfaces implemented not extends
{
	public void meth1()
	{
		System.out.println("Meth1 called in my");
	}
	public void meth2()
	{
		System.out.println("Meth2 called in my ");
	}
	public void meth3()
	{
		System.out.println("meth3 called in my");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		test1 t =new My();
		t.meth1();
		t.meth2();
//		t.meth3();
		
	}

}
