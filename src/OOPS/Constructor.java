package OOPS;


class Rectangl
{
	private double length;
	private double breadth;
	
	public Rectangl() //default constructor
	{
		length=1;
		breadth=1;
	}
	public Rectangl(double l, double b)
	{
		length=l;
		breadth=b;
	}
	public Rectangl(double s)
	{
		length=breadth=s;
	}
}
public class Constructor {
	
	public static void main(String[] args) {
		Rectangl r=new Rectangl();
		}

}
