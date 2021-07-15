class Engineer  
{
	void work()// create method 
	{
		System.out.println("Every Engineer have there own Work");
	}
	void sal ()
	{
	System.out.println("Every Engineer got some Sal ");	
	}
	void company()
	{
	System.out.println("Every Engineer work for a Company ");	
	}
}
class Cs extends Engineer
{
	String name="ANSHU";
    void work()// method overriding
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
class Upcasting_Work
{
	public static void main(String[] args) 
	{
	   Engineer e = new Cs();// Upcasting
	   e. work();
	   e.sal();
	   e.company();
	}
}
