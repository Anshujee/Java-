class Animal 
{
	void eat()
	{
		System.out.println("Eating");
	}
}
	class Dog extends Animal
	{
		void bark() 
			{
			System.out.println("Barking");	
			}
	}
	class Babydog extends Dog
	{
		void weep()
			{
			System.out.println("Weeping");		
			}
	}
		class Multilevel_inheritance
	{
			public static void main(String []args)
		{
			Babydog d = new Babydog();
			d.eat();
			d.bark();
			d.weep();
		}
	}
