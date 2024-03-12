package OOPS;

class Subject{
	
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	public String getSubID()
	{
		return subID;
	}

	public String getName() {
		return name;
	}

	public int getMaxMarks() {
		return maxMarks;
	}
	
	public int getMarksObtain()
	{
		return marksObtain;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	
	public void setMarksObtain(int marksObtain) {
		
		this.marksObtain=marksObtain;
	}
	public Subject(String sid,String name)
	{
		sid=subID;
		this.name=name;
	}
	public Subject(String sid,String name,int maxMarks,int marksObtain)
	{
		sid=subID;
		this.name=name;
		this.maxMarks=maxMarks;
		this.marksObtain=marksObtain;
	}
	
	boolean isQualified()
	{
		return marksObtain>=maxMarks/10*4;
	}

	@Override
	public String toString() {
		return "Subject [subID=" + subID + ", name=" + name + ", maxMarks=" + maxMarks + ", marksObtain=" + marksObtain
				+ "]";
	}
	
	
}

class Student1
{
	private int rollNo;
	private String name;
	private String dept;
	private String subject;
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDept()
	{
		return dept;
	}
	public String getSubject()
	{
		return subject;
	}
	
	public void setSubject(String Subject)
	{
		Subject=subject;
	}

	public Student1(int rollNo, String name, String dept, String subject) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + ", subject=" + subject + "]";
	}
	
}
public class ArrayOfPandC {

	public static void main(String[] args) {
		
		Subject subs[]=new Subject[3];
		subs[0]=new Subject("s101","DS",100, 45);  //Array of object created using constructors,
													// methods,getters,setters
		subs[1]=new Subject("s102","Algorithm",100,55);
		subs[2]=new Subject("s103","OperatingSystem",100,60);
		
		for(Subject s:subs)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		Student1 s[] = new Student1[3];
		s[0]=new Student1(101,"Krishna","Admin","Ds");
		s[1]=new Student1(102,"Hamu","Service","Ma");
		s[2]=new Student1(103,"Mihir","Maintaince","MM");
		
		for(Student1 s1:s)
		{
			System.out.println(s1);
		}
		
	}

}
