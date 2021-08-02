abstract class Base// Abstract Class Declaration.
{
	  abstract void fun();// Abstract Method Declaration.
}
class Demo extends Base// Demo class Inharit Base Class.
{
	 void fun()//Concreat Method declaration or Overriding fun() method.
	{
		System.out.println("Demo fun() Method Calling");
	}
}
class Example_Abstract_Class_Base
{
	public static void main (String []args)
	{
		Base b= new Demo();
		b.fun();
	}
}