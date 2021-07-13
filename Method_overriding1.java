class Rbi 
{
	void rateofintrest()
	{
		System.out.println("Rate of Intrest is 12% on Personal Loan");
	}
}
class Hdfc_bank extends Rbi
{
	void rateofintrest()
	{
		System.out.println("Rate of Intrest in HDFC Bank on Personal Loan is 7%");
	}
}
class Icici_bank extends Rbi
{
	void rateofintrest()
	{
		System.out.println("Rate of Intrest in Icici Bank on Personal Loan is 6%");
	}
}
class Method_overriding1
{
	public static void main(String[]args)
	{
	  Hdfc_bank h= new Hdfc_bank();
	  h.rateofintrest();
	  Icici_bank i=new Icici_bank();
	  i.rateofintrest();
	}
}
    