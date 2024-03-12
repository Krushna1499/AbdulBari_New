package SimplePrograms;

public class ZohoCampany {

		public static void zoho() {
			for(int i=0;i<=5;i++)
			{
				System.out.println(help(5,i)+" ");
			}
		}
		private static int help(int n,int k )
		{
			if(k==0||k==n)
				return 1;
			return help(n-1,k-1)+help(n-1,k);
		}
	public static void main(String[] args) {
		System.out.println(help(20, 20));
		zoho();
	}

}
