class Student1
{
	String sname;
	int rollno;
	String branch;
	//static String Collname ="PSIT";

	Student1(String sname, int rollno,String branch)
	{
		
		this.sname=sname;
		this.rollno=rollno;
		this.branch=branch;
	}
	void m1()
	{
		System.out.println(sname+"  "+rollno+"  "+branch);
	}
}
class This_Study1
{
	public static void main(String [] args)
	{
		System.out.println("Main Starts");
		Student1 s1 =new Student1("ANSHU",12052,"EEE");
		s1.m1();
        Student1 s2 =new Student1("Anand",12200,"MCA");
		s2.m1();
        System.out.println("Main Ends");
	}
}
