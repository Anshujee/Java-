class Books 
{
	private String title;
	private double price;
	private int bid;
	public String getTitle()
	{
		return title;
	}
	public void setPrice()
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setBid()
	{
		this.bid=bid;
	}
	Books()
	{
	}
	Books(String title, double price, int bid)
	{
		this.title=title;
		this.price=price;
		this.bid=bid;
	}
	void display()
	{
		System.out.println("This is the Book of :-"+title);
		System.out.println("The cost of Book is :-"+price);
		System.out.println("The book id of thisbook is :-"+bid);

	}
}
class Get_Set_Method2
{
	public static void main(String[] args) 
	{
		Books b = new Books("JAVA", 550.99, 102);
		b.display();
	}
}
