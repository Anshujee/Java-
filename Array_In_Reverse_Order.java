package Arrays_Code;

public class Array_In_Reverse_Order {
	public static void main(String[] args) {
		int [] a = new int[]{2,5,6,7,8};
		System.out.println("Orignal Array");
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("Print Array in Reverse order ");
		for (int i = a.length-1; i>=0 ; i--) {
			System.out.print(a[i]+ " ");
		}
	}
}
