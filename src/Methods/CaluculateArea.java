package Methods;

import java.awt.geom.Area;

public class CaluculateArea {
	static double area(double l, double b)
	{
		double a = l*b; //rectangle
		return a;
	}
	
	double area(double radius)
	{
		return Math.PI*radius*radius; //area of circle
		
	}
	 double area(double a,double b,double h)
	{
		double c=0.5*(a+b)*h;
		return c;
	}

	public static void main(String[] args) {
		CaluculateArea a=new CaluculateArea();
		System.out.println("Area of Trepizium: "+a.area(2, 2,3));
		System.out.println("Area of circle: "+a.area(10));
		System.out.println("Area of rectangle:"+area(10.1,5));
	}

}
