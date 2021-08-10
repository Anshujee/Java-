class Car 
{
  Engine e = new Engine();
}
class Engine 
{
}
class Driver_Early_Instantiation
{
	public static void main(String[]args)
	{
		Car c = new Car();
	System.out.println(c);
	System.out.println(c.e);
   System.out.println("======================");
   Car c1= new Car();
   System.out.println(c1);
   System.out.println(c1.e);
   System.out.println("======================");
   Car c2 = new Car();
   System.out.println(c2);
   System.out.println(c2.e);
   }
}