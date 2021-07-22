class Payment_System 
{
	static void Phpay(String un, int upin , long Psw )
	{
	 String username= "jeeanshu24";
	 int UPI = 2405;
	 long password = 7084508684l;
	 if (username==un && UPI==upin && password==Psw)
	 {
		 System.out.println("Login Successful");
         System.out.println("Proceed the Payment");
	 }
	}
	static void Logout()
	{
	System.out.println("Logout Successfully........");	
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
        Phpay("jeeanshu24", 2405, 7084508684l);
        Logout();
        System.out.println("Main Ends");
	}
}
