package array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = { 200, 400, 100, 900 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
			
		}
		
		System.out.println("-------------------------------------");
		
		String [] fruits = {"apple", "mango", "banana", "cherry", "pineapple"};
		for(int j=fruits.length-1; j>=0; j--) {
			System.out.println(fruits[j]);
		}
		
		System.out.println("---------------------------------");
		
		char [] c= {'a','d','e','f'};
		for(int h=c.length-1; h>=0;h--) {
			System.out.println(c[h]);
		}
		
		}

}
