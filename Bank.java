class Account // Creating class
{
	int accno;// initialize instance variable
	String name;
	float amt;
	void insert(int a, String n, float am)// method creation insert
	{
	accno=a;
	name=n;
	amt=am;
	System.out.println(accno+"  "+name+"  "+am);
	}
	void deposit(float am)// method creation deposite
	{
	amt=amt+am;
	System.out.println("Amount Deposited RS.  "+am);
	}
	void withdraw (float am)// method creation withdraw
		{
			if (amt<am)
			{
				System.out.println("Insufficent Balance");
			}
			else
			{
			amt=amt-am;
			System.out.println(am +"  Withdrawl from your Account");
			}
		}
		void balance()// method creating balance
	{
		System.out.println("Your Account Balance is Rs. "+amt);
	}
}
	class Bank
	{
	public static void main(String[] args) 
	{
		
        Account a = new Account();
        a.insert(7084508, "ANSHU JEE", 1000);
		a.deposit(25000);
		//a.withdraw(55000);
		a.balance();
	}
}
