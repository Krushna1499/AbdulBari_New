package AbstractClass;

abstract class Shape
{
	abstract double perimeter();
	
	
	abstract double area();
}

 class Circle extends Shape
{
	 double radius = 10;
	double perimeter()
	{
		return 2*Math.PI*radius;
	}
	double area()
	{
		return Math.PI*radius*radius;
				
	}
	
}
 class Rectangle extends Shape
 {

	double length = 5;
	double width = 5;
	@Override
	double perimeter() {
		
		return 2*(length+width);
		
	}

	@Override
	double area() {
		return  width *length;
	}
	 
 }
public class Demo2 {

	public static void main(String[] args) {
		
//		Shape s =new Circle();
//		System.out.println("Area of circle: "+s.area());
//		System.out.println("perimeter of circle "+s.perimeter());
//		Shape s1 =new Rectangle();
//		System.out.println(s1.area());
//		System.out.println(s1.perimeter());
		
		Rectangle r =new Rectangle();
		System.out.println(r.area());
		
		Shape s =r;				//Dynamic dispatch
		System.out.println(s.area());
	}

}
