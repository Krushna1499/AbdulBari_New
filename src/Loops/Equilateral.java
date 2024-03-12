package Loops;

public class Equilateral {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)   // i 0
		{
			for(int j=5;j>n-i;j--) { //for spaces
				System.out.print(" ");
			}
			//number
			int num = 1;
			for(int k=5;k>i;k--) {
				System.out.print("*"+" ");
				num = num * (i-k)/(k+1);
			}
			System.out.println();
	}

}
}
