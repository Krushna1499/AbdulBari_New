package OOPS;

import jdk.jfr.Recording;

public class Rectangle {
	public double radius;
	public double breadth;
	
	public double area()
	{
		return radius*breadth;
	}
	public double perimeter()
	{
		return 2*(radius*breadth);
	}
	public boolean isSquare()
	{
		if(radius==breadth);
		return true;
	}
	

	public static void main(String[] args) {
		Rectangle r1 =new Rectangle();
		r1.radius=3;
		r1.breadth=3;
		System.out.println("Area of circle: "+r1.area());
		System.out.println("Area of perimeter: "+r1.perimeter());
		
	}
	

}
