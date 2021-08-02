abstract class Base
{
 final void fun()
	{
		System.out.println("Final Method fun() Called");
	}
}
class Demo extends Base
{
	void fun1()
	{
		System.out.println("Demo method fun1() called");
	}
}
class Example_Abstract_Class_Base3
{
	public static void main (String[] args)
	{
		Base b = new Demo();
		b.fun();
		Demo d = new Demo();
		d.fun1();
	}
}
