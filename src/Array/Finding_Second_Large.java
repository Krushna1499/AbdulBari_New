package Array;

public class Finding_Second_Large {

	public static void main(String[] args) {
		int A[]= {3,6,9,12,15,24,27};
		int max1,max2;
		max1=max2=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>max1) {
				max2=max1;
				max1=A[i];
			}else if(A[i]>max2) {
			max2=A[i];
		
		}	
	}System.out.println("Second Largest is: "+max2);


}
}