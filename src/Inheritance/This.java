package Inheritance;

class Rectangle
{
	int length;
	int breadth;
	Rectangle(int l, int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void display()
	{
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}
public class This {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		r.display();
	}

}
