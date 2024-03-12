package SimplePrograms;

public class Stri_meth_Challe {

	public static void main(String[] args) {
		String str1 = "programmer@gmail.com";
		
		int i =str1.indexOf("@");
		String uname=str1.substring(0,i);
		String domain=str1.substring(i, str1.length());
		System.out.println("Username: "+uname);
		System.out.println("domain: "+domain);
		int j =str1.indexOf(".");
		String name= str1.substring(0,j);
		System.out.println(str1.equals("gmail"));

	}

}
