package Arrays_Code;

public class Find_Mimimum_In_Arrays {
	public static void main(String[] args) {
		int[] a = {125,12,14,150,85,90,-5};
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<min) 
				min = a[i];
			}
			System.out.println("Smallest element present in given array: "+min);
		}
	}


