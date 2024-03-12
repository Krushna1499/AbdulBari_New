package Inheritance;

 class Super1
{
public void display()
{
	System.out.println("Print m1display");
}

}

 class Sub extends Super1
 {
	 @Override
	 public void display()
	 {
		 System.out.println("Print m2display");
	 }
 }
public class PolyOverride {

	public static void main(String[] args) {
		Super1 s=new Sub(); //run time polymorphism
		s.display();
		
	}
}
