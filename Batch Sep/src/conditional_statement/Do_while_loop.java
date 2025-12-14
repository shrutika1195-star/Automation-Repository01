package conditional_statement;

public class Do_while_loop {

	public static void main(String[] args) {
		// 1 to 40 number
		System.out.println("----------1 to 40 numbers-----------");
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 40);
		System.out.println();

		// 40 to 1 number
		System.out.println("-------------40 to 1 number-----------");
		int a = 40;
		do {
			System.out.print(a + " ");
			a--;
		} while (a >= 1);
		System.out.println();

		// 10 times ManualTesting
		System.out.println("---------------10 times Manual_Testing---------------");
		int b = 1;
		do {
			System.out.println("Manual_Testing");
			b++;
		} while (b <= 10);

		// 1 to 30 even num
		System.out.println("--------------1 to 30 even number---------------");
		int c = 1;
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= 30);
		System.out.println();

		// 1 to 30 odd num
		System.out.println("-------------------1 to 30 odd number--------------");
		int d = 1;
		do {
			System.out.print(2 * d - 1 + " ");
			d++;
		} while (d <= 15);
		System.out.println();
	}

}
