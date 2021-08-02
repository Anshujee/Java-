abstract class Base
{
	Base ()
	{
		System.out.println("Base Constructor Called");
	}
	abstract void fun();
}
class Demo extends Base
{
	Demo()
	{
		System.out.println("Demo Constructor Called");
	}
	void fun()
	{
		System.out.println("Demo Method fun() Called");
	}
}
class Example_Abstract_Class_Base1
{
	public static void main (String[]args)
	{
		Demo d = new Demo();
		d.fun();
		Base b= new Demo();
		b.fun();
	}
}
