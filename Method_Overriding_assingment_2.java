class Engineer  
{
	void work()
	{
	System.out.println("Every Engineer have there own Work");	
	}
	void sal()
	{
		System.out.println("Every Engineer got some Sal ");
	}
	void company()
	{
	System.out.println("Every Engineer work for a Company ");	
	}
}
class Elec extends Engineer
{
	String name="Ajay";
	void work()
	{
	System.out.println(name + "  is an electrical engineer ");	
	}
	void sal ()
	{
	System.out.println(name + " get Sal of Rs. 120000 ");		
	}
	void company()
	{
	System.out.println(name + " Work in ABB ");		
	}
}
class Cs extends Engineer 
{
	String name="Anshu";
	void work()
	{
	System.out.println(name + " is a Software Engineer ");		
	}
	void sal()
	{
	System.out.println(name + " get Sal of Rs. 150000 ");	
	}
	void company()
	{
	System.out.println(name + " Work in INFOSYS ");	
	}
}
class Method_Overriding_assingment_2
{
	public static void main(String[] args)
	{
		Elec e = new Elec();
		e.work();
		e.sal();
		e.company();
		Cs c = new Cs();
		c.work();
		c.sal();
		c.company();
	}
}
