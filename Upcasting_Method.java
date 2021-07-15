class Vehicle //Super class Vehicle 
{
	int price;// instance Variable or states
	String brand;
	String clr;
	void travel()// method or behaviour
	{
		System.out.println("Traveling");
	}
	void startEngine()
	{
		System.out.println("Start the Engine");
	}
	void stopEngine()
	{
		System.out.println("Stop the Engine");
	}
}
	class Car extends Vehicle// sub class car
	{
	}	
	class Upcasting_Method
 {
	public static void main(String[] args) 
	{
		
         Vehicle v = new Car();//Upcasting 
         v.travel();
		 v.startEngine();
         v.stopEngine();
	}
}
