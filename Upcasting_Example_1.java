class Machine 
{
	void start ()
	{
		System.out.println("Machine Start....");
	}
	void run()
	{
	System.out.println("Machine Run....");	
	}
}
class Motor extends Machine 
{
	void start()
	{
		System.out.println("Motor Start....");
	}
	void run ()
	{
		System.out.println("Motor Run....");
	}
}
class Generator extends Machine
{
	void start()
	{
		System.out.println("Genarator Start....");
	}
	void run()
	{
		System.out.println("Genarator Run....");
	}
}
class Upcasting_Example_1
{
	public static void main(String [] args)
	{
	Machine m = new Machine();
	m.start();
	m.run();
	Motor mo = new Motor();
	mo.start();
	mo.run();
    Generator g= new Generator();
     g.start();
	g.run();//
    Machine m1 = new Motor();
    m1.start();
	m1.run();
	Machine m2= new Generator();
	m2.start();
	m2.run();
	Motor m3=(Motor)m1;
	m3.start();
	m3.run();
	Generator g1 = (Generator) m2;
	g1.start();
	g1.run();
	}
}
