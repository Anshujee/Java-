package Arrays_Code;

public class Find_Duplicate_Array_Ex {
	public static void main(String[] args) {
		int [] a = new int []{1,2,2,3,4,5,4,6,7,7,8};
		System.out.println("Duplicate value in given Array is: ");
		for(int i:a)
		{
			for(int j:a)
			{
			if (i==j)
				System.out.println(j+" ");
			}
		}
	}

}
