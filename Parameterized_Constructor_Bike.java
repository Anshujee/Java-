class Parameterized_Constructor_Bike
{
	String clr;
	String brand;
	int price;
	int topspeed;

	Parameterized_Constructor_Bike(String c,String b, int p, int t)//Prametarized Constuctor
	{
	 clr=c;
	 brand=b;
	 price=p;
	 topspeed=t;
	}
}
class Twowheelar
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Parameterized_Constructor_Bike bp =new Parameterized_Constructor_Bike("black","Pulser",800000,150);
		System.out.println(bp.clr+"  "+bp.brand+"  "+bp.price+"  "+bp.topspeed);
		Parameterized_Constructor_Bike bp1=new Parameterized_Constructor_Bike("Red", "Hero", 650000,120);
		System.out.println(bp1.clr+"  "+bp1.brand+"  "+bp1.price+"  "+bp1.topspeed);
		Parameterized_Constructor_Bike bp2=new Parameterized_Constructor_Bike("Green", "Honda", 750000,140);
		System.out.println(bp2.clr+"  "+bp2.brand+"  "+bp2.price+"  "+bp2.topspeed);
        System.out.println("Main Ends");
	}
}
