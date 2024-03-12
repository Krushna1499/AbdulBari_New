package Inheritance;

class TV
{
	public void switchON()
	{
		System.out.println("TV is Switched ON");
	}
	public void changeChannel() {
		System.out.println("TV channel is changed");
	}
}
class SmartTV extends TV
{
	@Override
	public void switchON()
	{
		System.out.println(" SmartTV is Switched ON");
	}
	@Override
	public void changeChannel() {
		System.out.println("SMART TV channel is changed");
	}
	public void browse() {
		System.out.println("Smart TV browsing");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		TV t=new TV();
		t.switchON();
		t.changeChannel();
		
		SmartTV s=new SmartTV();
		s.browse();
		s.changeChannel();
		s.switchON();
	}

}
