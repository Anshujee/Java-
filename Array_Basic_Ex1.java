package Arrays_Code;

public class Array_Basic_Ex1 {
	public static void main(String[] args) {
		int [] a = new int [5];
		a [0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		//for (int i:a)
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print(a[j]+" ");
		}
		
	}

}
