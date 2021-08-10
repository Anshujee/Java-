 class Bank_Branch// class declaration 
{
	Account a; //instant variable Account 
  String  ifsc;
  String Mgr_Name;
  Bank_Branch()//zero parametrized constructor
	{
	}
	Bank_Branch(String ifsc, String Mgr_Name)//parameterrized constructor
	{
		this.ifsc=ifsc;//calling local variable using this keyword
		this.Mgr_Name=Mgr_Name;//calling local variable using this keyword
	}
	
  public void display()//method declaration
	{
		System.out.println("The Name of the Branch Manager is : "+Mgr_Name);
		System.out.println("THe IFSC of the Barach is : "+ifsc);
		System.out.println("===============================================");
	}
	public String getifsc()// getmethod decration
	{
		return ifsc;
	}
	public void setMgr_Name()// setmethod declaration
	{
		this.Mgr_Name=Mgr_Name;
	}
	public String getMgr_Name()
	{
		return Mgr_Name;
	}
	public void createAccount(Account a)// Lazy Instantation or Helper method
	{
		this.a=a;
	}	
}
class Account
{
	private String acc_ho_name;
	private double balance;
	private long acc_no;

	public long getacc_no()
	{
		return acc_no;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public double getbalance()
	{
		return balance;
	}
	public void setacc_ho_name(String acc_ho_name)
	{
		this.acc_ho_name=acc_ho_name;
	}
	public String getacc_ho_name()
	{
		return acc_ho_name;
	}
	Account ()
	{
	}
	Account (long acc_no, double balance, String acc_ho_name)
	{
	this.acc_no=acc_no;
	this.balance=balance;
	this.acc_ho_name=acc_ho_name;
	}
	public void display()
	{
		System.out.println("The Account holder name is:- "+acc_ho_name);
		System.out.println("The Account blanace is :- "+balance);
		System.out.println("The Account number is :- "+acc_no);
	}
}
class Bank_Driver
{
	public static void main(String[]args)
	{
		Bank_Branch b=new Bank_Branch("SBIN1220", "Anshu Jee");
		b.display();
		b.createAccount(new Account(3520265456l,55000.00,"Anshu Jee"));
		b.a.display();
        System.out.println("===============================================");
		Bank_Branch b1=new Bank_Branch("ICICI12025", "SANDEEP");
		b1.display();
		b1.createAccount(new Account(123456845854l,15000.00,"Aayansh"));
		b1.a.display();
	}
}

