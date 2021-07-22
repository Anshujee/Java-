import java.util.Scanner;
class If_Else
{
public static void main(String [] args)
{	

//int weight = 45;
//int height=6;
Scanner sc = new Scanner(System.in);

System.out.println("Please enter your Age");
int age=sc.nextInt();
System.out.println("Please enter your Weight");
int weight =sc.nextInt();
System.out.println("Please enter your Height");
//int age=sc.nextInt();

//int weight =sc.nextInt();
int height=sc.nextInt();

if (age>=18 && age<=55)
{
	if(weight>=40)
	{
		if(height>=5)
		{
		System.out.println("You Are Eligable to donate Blood Please Go ahead.");	
		}		
		else
		{
		System.out.println("You Are not Eligable to donate Blood Please cheack the Height.");		
		}	
		}
	else
	{
		System.out.println("You Are not Eligable to donate Blood Please cheack the Weight.");
	}	
	}
	else 
	{
		System.out.println("You Are not Eligable to donate Blood Please cheack the Age.");
	}
}

}
