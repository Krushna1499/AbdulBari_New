package SimplePrograms;

//swap without third variable
public class Swapno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=12.0f, b=24.5f;
		 System.out.println("--Before swap--");
	        System.out.println("First number = " + a);
	        System.out.println("Second number = " + b);
	        
	        a = a-b;
	        b = a+b;
	        a =b-a;
	        System.out.println("--After swap--");
	        System.out.println("First number = " + a);
	        System.out.println("Second number = " + b);     
	}

}
