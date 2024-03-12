package OOPS;

public class Student {
	public int rollno;
	public String name;
	public String course;
	public int m1,m2,m3;
	public double total()
	{
		return m1+m2+m3;
	}
	public double avg()
	{
		return total()/3;
	}
	public char grade()
	{
		if(avg()>=70)
		{
		return 'A';
		}
		else return'B';
	}
	public String details()
	{
		return "Roll No:"+rollno+"\n "+"Name: "+name+"\n"+"Course: "+course+"\n ";
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.rollno=1;
		s.name="Krish";
		s.course="CS";
		s.m1=70;
		s.m2=80;
		s.m3=65;
				
		System.out.println("Total: "+s.total());
		System.out.println("Average: "+s.avg());
		System.out.println("Grade: "+s.grade());
		System.out.println("Details: "+s.details());
	}

}
