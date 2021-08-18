package Arrays_Code;

public class Find_Maximum_In_Arrays {
	public static void main(String[] args) {
		int [] a ={5,7,2,15,25,65,140,8,10};
		int max =a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max)
			  max = a[i];
		}
		System.out.println("Largest element present in given array: "+max);
		
	}

}
