package conditional_statement;

public class Looping_statement {

	public static void main(String[] args) {
		// For Loop
		// 1 to 100
		System.out.println("---------1 to 100 numbers--------------");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------100 to 1 numbers-------------");
		// 100 to 1
		for (int a = 100; a >= 1; a--) {
			System.out.print(a + " ");
		}
		System.out.println();

		// Print 10 times Automation
		System.out.println("-------------------10 times Automation-------------");
		for (int b = 1; b <= 10; b++) {
			System.out.println("Automation");
		}

		// 1 to 100 even number
		System.out.println("----------------1 to 100 even number---------------");
		for (int c = 1; c <= 100; c++) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
		// 1 to 100 odd number
		System.out.println("-----------------------1 to 100 odd number----------------");
		for (int d = 1; d <= 100; d++) {
			if (d % 2 != 0) {
				System.out.print(d + " ");
			}
		}
		System.out.println();

		// print 100 times &

		for (int e = 1; e <= 100; e++) {
			System.out.print(" & ");
		}

	}

}
