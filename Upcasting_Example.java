class Parent
{
    String lastname;
	void method()
	{
	System.out.println("Parent Class Method..OR Super class Method....");	
	}
}
class Child extends Parent
{
	String firstname;
     void method()
	{
	System.out.println("Child Class Method...OR Sub Class Method...");	
	}
}
class Upcasting_Example/* Upcasting- Superclass referance refring any of its sub  class object called as Upcasting*/ 
{
	public static void main (String [] args)
	{
		Parent p = new Child();// Upcasting here for sub class object we assing super class referance.
		p.lastname="Verma";
		System.out.println(p.lastname);
		p.method();
		Child c = (Child)p;// Downcasting 
		c.firstname="Anshu";
		//c.lastname="Verma";
		System.out.println(c.firstname + c.lastname);
		c.method();
	}
}