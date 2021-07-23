class Break_Using_While_Loop 
{
	public static void main(String[] args) 
	{
		int i =1;
			while (i<=10)
			{
			if (i==9)
			{
				i++;
				break;
			}
			System.out.println(i);
			i++;
			}
	}
}
