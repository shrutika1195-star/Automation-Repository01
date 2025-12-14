package array;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
//		int[] a = new int[6];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 6; i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(a));

	//	 }
		String[] names = new String[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			names[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(names));
	}
}