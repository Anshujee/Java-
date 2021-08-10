class Sim 
{

}
class Phone
{
	Sim s;
	public void insertSim(Sim s)//Lazy Instantation or Helper Method
	{
		this.s = s;
	}
}
class Lazy_Instantation_Example
{
	public static void main(String[]args)
	{
		Phone p = new Phone();
		System.out.println(p);
		System.out.println(p.s);
		System.out.println("==========================");
		p.insertSim(new Sim());
		System.out.println(p.s);
	}
}

