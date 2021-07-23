class Break_Statment_Example 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=3 ;i++ )//Outer Loop 
		{
			for (int j=1;j<=3 ;j++ )// Inner Loop
			{
				if (i==3 && j==3)
				{
					break; // Break The Inner Loop
				}
				System.out.println(i+"  "+j);
				
			}
		}
	
	}
}
