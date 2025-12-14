package conditional_statement;

public class Continue {

	public static void main(String[] args) {
		// continue for loop
		// 1 to 25
		System.out.println("-----------1 to 25---------");
		for (int i = 1; i <= 25; i++) {
			if (i == 14) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// 25 to 1
		System.out.println("------------25 to 1----------");
		for (int c = 25; c >= 1; c--) {
			if (c == 9) {
				continue;
			}
			System.out.print(c + " ");
		}
		System.out.println();

		System.out.println("-----------------20 to 40-----------");
		// while loop
		int a = 19;
		while (a <= 39) {
			a++;
			if (a == 22) {
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println();
		// 40 to 20
		System.out.println("-------------40 to 20-----------");
		int d = 40;
		while (d >= 1) {
			d--;
			if (d == 26) {
				continue;
			}
			System.out.print(d + " ");
		}
		System.out.println();

		
		// do while loop
		System.out.println("------------50 to 25----------");
		int e=50;
		do {
			e--;
			if(e==44) {
				continue;
			}
			System.out.print(e+" ");
		}while(e>=25);
		
		System.out.println();
		System.out.println("-------------25 to 50----------");
		int b = 24;
		do {
			b++;
			if (b == 30) {
				continue;
			}
			System.out.print(b + " ");

		} while (b <= 49);
		System.out.println();

	}

	
  
}
