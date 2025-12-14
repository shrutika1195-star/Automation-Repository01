package conditional_statement;

public class Patterns {

	public static void main(String[] args) {
		// Hollow rectangle
		System.out.println("------------Hollow rectangle-----------");
		for (int f = 1; f <= 6; f++) {
			for (int g = 1; g <= 7; g++) {
				if (f == 1 || f == 6 || g == 1 || g == 7) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		for (int p = 1; p <= 5; p++) {
			for (int q = 1; q <= 6; q++) {
				if (p == 1 || p == 5 || q == 1 || q == 6) {
					System.out.print(q + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// half pyramid

		System.out.println("---------Half pyramid---------");

		for (int h = 1; h <= 5; h++) {
			for (int j = 1; j <= h; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		for (int m = 1; m <= 5; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print(m + " ");

			}
			System.out.println();
		}
		System.out.println("-------------------------------");

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");

			}
			System.out.println();
		}

		// inverted pyramid
		System.out.println("---------Inverted pyramid------");
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println("-------------inverted number pyramid--------");
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		
		for (int e= 5; e >= 1; e--) {
			for (int f = 1; f <= e; f++) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
		

		}
		
		
	}

