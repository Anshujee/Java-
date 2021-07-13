class Vehicle
{
	String brand= "BMW";
    int price=5000000;
	String clr= "BLUE";
    int enginecc=500;
	int milage=12;

	void travel()
	{
		System.out.println("Traveling");
	}
	void startEngine()
	{
	System.out.println("Start");	
	}
	void stopEngine()
	{
	System.out.println("Stop");	
	}
	void applyBreak()
	{
	System.out.println("Breaking");	
	}
}
    class Car extends Vehicle
   {
	
   }
   class Single_Inharitance
   {
	   public static void main(String args[])
		   {
			Car c = new Car();
			System.out.println(c.brand);
            System.out.println(c.price);
			System.out.println(c.clr);
			System.out.println(c.enginecc);
			System.out.println(c.milage);
			c.travel();
			c.startEngine();
			c.stopEngine();
			c.applyBreak();
		   }
   }
