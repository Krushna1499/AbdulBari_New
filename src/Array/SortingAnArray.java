package Array;

public class SortingAnArray {

	public static void main(String[] args) {
		String arr[]= {"Java","Python","pascal","smalltalk","ada","basic"};
		java.util.Arrays.sort(arr);
		
		for(String x: arr)
			System.out.println(x);
	}

}
