package scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		System.out.println("Table is");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}

	
	

	}

}
