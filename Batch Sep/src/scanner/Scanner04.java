package scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("--------------1 to 30 even number---------------");
		int c = sc.nextInt();
		System.out.println("Enter the number");
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= 30);
		System.out.println();

		
		
		System.out.println("--------------------10 times Testing----------------");
		// 10 times
		int b = sc.nextInt();
		System.out.println("Enter the number");
		while (b <= 10) {
			System.out.println("Testing");
			b++;
		}
		
	}

}
