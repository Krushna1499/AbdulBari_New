package Methods;

public class MethodPracticeString {
	static void showList(int start,String ...S)
	{
		for(int i=0;i<S.length;i++) {
			System.out.println(start+" ."+S[i]);
			start++;
		}
	}

	public static void main(String[] args) {
		showList(1,"John","Smith","Ajay","Krishna","Mark","Vaibhav");
		
	}

}
