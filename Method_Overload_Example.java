class  Method_Overload_Example
{
	static void multi(int a, int b)//Multiple Method of same name inside a class but parameter Should be Diffrent 
		{
			System.out.println(a*b);
		}
		static void multi(float a,float b)//Multiple Method of same name inside a class but parameter Should be Diffrent 
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		multi(5,5);
		multi(5.5f,6.5f);
		System.out.println("Hello Madaharchood");
	}
}
