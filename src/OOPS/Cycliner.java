package OOPS;

public class Cycliner {
	
	public double radius;
	public double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+cicumference()*height;
	}
	public double cicumference()
	{
		return 2*Math.PI*radius;
	}
	public double volume()
	{
		return lidArea()*height;
	}

	public static void main(String[] args) {
		
		Cycliner c=new Cycliner();
		c.radius=7;
		c.height=10;
		System.out.println("lidArea of cylinder: "+c.lidArea());
		System.out.println("totalSurfaceArea: "+c.totalSurfaceArea());
		System.out.println("volume: "+c.volume());
		
	}

}
