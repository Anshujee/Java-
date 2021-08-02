abstract class Base
{
	void fun()
	{
		System.out.println("Base fun() called");
	}
	 abstract void fun2(); 
}
class Demo extends Base 
{
 void fun1()
	{
	System.out.println("Demo Method fun1() called");	
	}
	void fun2()
	{
	System.out.println("Demo Method fun2() Called");	
	}
}
class Example_Abstract_Class_Base2
{
	public static void main(String[]args)
	{
		Demo d =new Demo();
		d.fun();
		d.fun1();
		Base b = new Demo();
		b.fun2();
	}
}