package Methods;

public class MethodPractice {

		static int max(int x,int y)
		{
			return x>y?x:y;
		}
		static float max(float x,float y)
		{
			return x>y?x:y;
		}
		static int max(byte x, byte y)
		{
			if(x>y)
			return x;
			else
				return y;
					
		}
	public static void main(String[] args) {
//		System.out.println(max(10f,11));
		byte a=10,b=12;
		System.out.println(max(a,b));
		
	}

}
