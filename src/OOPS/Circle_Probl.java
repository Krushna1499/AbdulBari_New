package OOPS;

public class Circle_Probl {
	
	public double radius;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
	}

	public static void main(String[] args) {
		Circle_Probl c1= new Circle_Probl();
		
		c1.radius=7;
		System.out.println("Area of circle: "+c1.area());
		System.out.println("Perimeter: "+c1.perimeter());
		System.out.println("cicumference: "+c1.circumference());
	}

}
