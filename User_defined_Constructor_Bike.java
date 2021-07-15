// User Defined Constructor
class User_defined_Constructor_Bike  
{
	String clr;
	int price;
	String brand;
	User_defined_Constructor_Bike()// Constructor class name should be same.
	{
		System.out.println("User Defined Costructor");
		clr="Black";
		price=500000;
		brand="KTM";
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		User_defined_Constructor_Bike b= new User_defined_Constructor_Bike();// creat a method
		System.out.println(b.clr+"  "+b.price+"  "+b.brand);
		System.out.println("Main Ends");
	}
}
