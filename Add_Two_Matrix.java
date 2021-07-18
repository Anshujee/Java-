import java.util.Scanner;
class Add_Two_Matrix 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Row and Columns of Matrix");
		int m = in.nextInt();
		int n = in.nextInt();
		int first [] [] = new int [m][n];
		int second [] [] = new int [m][n];
		int sum [] [] = new int [m][n];
		System. out .print("Enter the elemnt of first matrix");
		for (int c=0;c<m ;c++ )
		
			for (int d =0;d<n ;d++ )
			
				first [c][d]= in.nextInt();
			
	System. out .print("Enter the elemnt of Second matrix");
	
	for (int c =0;c<m ;c++ )

		for (int d=0;d<n ;d++ )

second [c][d]=in.nextInt();
   for (int c=0;c<m ;c++ )

	for (int d= 0;d<n ;d++ )
	
	sum [c] [d]= first [c][d] + second [c][d];

	System.out.println("Sum of Entered Matrix :-");
		for (int c=0;c<m ;c++ )
		{
		for (int d=0;d<n ;d++ )
		
			System.out.print(sum [c][d] +" ");
			System.out.println();
		
		}

	}
}
