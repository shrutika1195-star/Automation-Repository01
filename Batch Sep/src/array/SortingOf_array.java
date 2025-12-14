package array;

import java.util.Arrays;

public class SortingOf_array {

	public static void main(String[] args) {
		int[] a = { 800, 900, 400, 200, 100 };
		System.out.println("Before sorting");

		System.out.println("After sorting" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------");
		
		float [] b = {47.5f, 35.5f, 10.5f, 75.8f, 95.1f, 5.59f};
		System.out.println("Before sorting");
		System.out.println("After sorting" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println("----------------------------------");
		
		char [] c = {'c','h','r','b','o','d','a'};
		System.out.println("Before sorting");
		System.out.println("After sorting" + Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		System.out.println("----------------------------------");
		
		String [] city = {"Nagpur", "Mumbai", "Pune", "Kolkata", "Banglore"};
		System.out.println("Before sorting");
		System.out.println("After sorting" + Arrays.toString(city));
		Arrays.sort(city);
		System.out.println(Arrays.toString(city));
		
		
		
	}

}
