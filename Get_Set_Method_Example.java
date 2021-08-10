class Sim                  
{
	private String Serviceprovider;
	private long Num;
	public long getNum()
	{
		return Num;
	}
	public void setServiceprovider()
	{
		this.Serviceprovider=Serviceprovider;
	}
	Sim()
	{
	}
	Sim (String Serviceprovider, long Num)
	{
		this.Serviceprovider=Serviceprovider;
		this.Num=Num;
	}
	void display()
	{
		System.out.println("The Mobile Number of The Customer is : "+Num);
        System.out.println("The Service provider Network is : "+Serviceprovider);
	}
}
class Get_Set_Method_Example
{
	public static void main(String[] args) 
	{
	   Sim s = new Sim("JIO", 7903494269l);
	   Sim s1 = new Sim("Airtel", 7903494269l);
	   s.display();
	   s1.display();
	}
}
