package Inheritance;

class Rectanglee
{
	int length;
	int breadth;
	int x=10;

Rectanglee(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
	
}
}
class Cuboid extends Rectangle
{
	int height;
	int x=20;

Cuboid(int l,int b,int h)
{
	super(l,b);
	height=h;
}
void display()
{
	System.out.println(super.length);
	System.out.println(x);
}
}
public class Super {

	public static void main(String[] args) {
		Cuboid c = new Cuboid(10,20,10);
		c.display();
	}

}
