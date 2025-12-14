package conditional_statement;

public class While_loop {

	public static void main(String[] args) {
		// 1 to 50 numbers
		System.out.println("------------1 to 50 numbers--------------");
		int i = 1;
		while (i <= 50) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("-------------------50 to 1 numbers--------------");
		// 50 to 1 numbers
		int a = 50;
		while (a >= 1) {
			System.out.print(a + " ");
			a--;
		}
		System.out.println();
		System.out.println("--------------------10 times Testing----------------");
		// 10 times
		int b = 1;
		while (b <= 10) {
			System.out.println("Testing");
			b++;
		}

		// 1 to 30 even number
		System.out.println("----------------1 to 30 even number----------------");
		int c = 1;
		while (c <= 30) {
			System.out.print(2 * c + " ");
			c++;
		}
		System.out.println();
		// 5 to 50 table
		System.out.println("--------------5*1=5 table-------");
		int d = 1;
		while (d <= 10) {
			System.out.println("5*" + d + "=" + (5 * d));
			d++;
		}

		// 1 to 30 odd number
		System.out.println("---------------1 to 30 odd number----------");
		int e = 1;
		while (e <= 30) {
			System.out.print(e * 2 - 1 + " ");
			e++;
		}
	}

}
