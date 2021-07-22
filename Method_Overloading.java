class Method_Overloading 
{
	public static void sqRoot()//Multiple Method of same name inside a class
	{
		int num =5;
		System.out.println("Sq Root of a given number is"+(num*num));
	}
	public static void sqRoot(int num)//Multiple Method of same name inside a class
	{
	System.out.println("Sq Root of a given number is"+(num*num));	
	}
	public static void sqRoot(double num)//Multiple Method of same name inside a class
	{
	System.out.println("Sq Root of a given number is"+(num*num));	
	}
	public static void main(String[] args) 
	{
		//System.out.println("Main Start");
        sqRoot();
		sqRoot(12);
		sqRoot(6.25);
		//System.out.println("Main End");
	}
}
