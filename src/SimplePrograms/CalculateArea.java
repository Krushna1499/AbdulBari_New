package SimplePrograms;

import java.util.Scanner;

public class CalculateArea {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Base: ");
		 float base=sc.nextFloat();
		 System.out.println("Enter the height: ");
		 float height=sc.nextFloat();
		 float area = (base * height)/2;
		
		 System.out.println("Calculate area: "+area);

	}

}
