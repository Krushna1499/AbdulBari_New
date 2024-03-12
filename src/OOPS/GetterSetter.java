package OOPS;

public class GetterSetter {
	private double length;
	private double breadth;
	
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	public void setLength(double l)
	{	if(l>=0)
		length=l;
	else
		length=0;
	}
	public void setBreadth(double b)
	{	if(b>=0)
		breadth=b;
	else
		breadth=0;
	}
	public double area()
	{
		return getLength()*getBreadth();
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public boolean isSquare()
	{
		if(length==breadth)
		return true;
		else 
			return false;
	}
	

	public static void main(String[] args) {
		GetterSetter r1 =new GetterSetter();
		r1.setLength(10.5);
		r1.setBreadth(5.5);
		
		System.out.println("Area of circle: "+r1.area());
		System.out.println("Area of perimeter: "+r1.perimeter());
		System.out.println("Is it a Square: "+r1.isSquare());
		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());
	}

}

