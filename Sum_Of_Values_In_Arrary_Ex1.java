package Arrays_Code;

public class Sum_Of_Values_In_Arrary_Ex1 {
	public static void main(String[] args) {
		int[] a={2,3,4,6,7,8,9};
		int sum =0;
		for (int i :a) 
		{
			sum +=i;
		}
			System.out.println("Sum of Arrays is : "+sum);
		}
	}