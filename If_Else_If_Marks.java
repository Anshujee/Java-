import java.util.Scanner;
class If_Else_If_Marks
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter The Marks Obtain in the subject 1");
int sub1 = sc.nextInt();
System.out.println("Please Enter The Marks Obtain in the subject 2");
int sub2 = sc.nextInt();
System.out.println("Please Enter The Marks Obtain in the subject 3");
int sub3 = sc.nextInt();
System.out.println("Please Enter The Marks Obtain in the subject 4");
int sub4 = sc.nextInt();
System.out.println("Please Enter The Marks Obtain in the subject 5");
int sub5 = sc.nextInt();
if (sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35)
{
	double avg = (sub1+sub2+sub3+sub4+sub5)/5;
	System.out.println("avg="+avg);
	if(avg >=35 && avg<50)
	{
	System.out.println("Pass");	
	}
	else if(avg>=50 && avg<60)
	{
	System.out.println("Second Division");	
	}
	else if ( avg>=60 && avg<85)
	{
		System.out.println("First Division");
	}
	else if (avg >= 85 && avg <100)
	{
		System.out.println("Distinction");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
}