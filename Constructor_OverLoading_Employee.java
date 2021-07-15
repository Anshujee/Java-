//Constructor_OverLoading
class Constructor_OverLoading_Employee
{
	int eid;
	String name;
	float sal;
	String loc;
	String dept;
	String job;
	String comp;
	Constructor_OverLoading_Employee(int i, String n, float s)
	{
		eid=i;
		name=n;
		sal=s;
	}
	Constructor_OverLoading_Employee(int i, String n, float s, String d)
		{
		eid=i;
		name=n;
		sal=s;
		dept=d;
		}

    Constructor_OverLoading_Employee(int i, String n, float s, String d, String j)
	{
	    eid=i;
		name=n;
		sal=s;
		dept=d;
		job=j;
	}
    Constructor_OverLoading_Employee(int i, String n, float s, String d, String j, String c)
		{
			
        eid=i;
		name=n;
		sal=s;
		dept=d;
		job=j;
        comp=c;
		}
}
 class Ework
 {
	public static void main(String[] args) 
	{
     Constructor_OverLoading_Employee e= new Constructor_OverLoading_Employee(1010, "ANSHU JEE", 45000);
	 System.out.println(e.eid+" "+e.name+" "+e.sal);
	 Constructor_OverLoading_Employee e1 = new Constructor_OverLoading_Employee (1010, "ANSHU JEE", 45000, "TESTING");
     System.out.println(e1.eid+" "+e1.name+" "+e1.sal+" "+e1.dept);
     Constructor_OverLoading_Employee e2 = new Constructor_OverLoading_Employee (1010, "ANSHU JEE", 45000, "TESTING", "Engineer");
     System.out.println(e2.eid+" "+e2.name+" "+e2.sal+" "+e2.dept+" "+e2.job);
     Constructor_OverLoading_Employee e3 = new Constructor_OverLoading_Employee (1010, "ANSHU JEE", 45000, "TESTING", "Engineer", "INFOSYS");
     System.out.println(e3.eid+" "+e3.name+" "+e3.sal+" "+e3.dept+" "+e3.job+" "+e3.comp);
	}

}
