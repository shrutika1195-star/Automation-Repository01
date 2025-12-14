package array;

public class Array_04 {

	public static void main(String[] args) {
		// without allocating memory //2D array
		// datatype [][]arrayname
		// ={{values1,values2},{values1,values2},{values1,values2},{values1,values2},.......................}
		// 4 row 2 col
		int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } };
		// nested for loop
		// row 0-3
		// col 0-1
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------");
		// row-4 colm-3
		// row 0 to 3
		// col 0 to 2

		int[][] b = { { 10, 15, 20 }, { 30, 35, 40 }, { 50, 55, 60 }, { 70, 75, 80 } };
		for (int p = 0; p < b.length; p++) {
			for (int q = 0; q < 3; q++) {
				System.out.print(b[p][q] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		// row-4 colm-4
		// row 0 to 3
		// col 0 to 3
		int[][] c = { { 05, 10, 15, 20 }, { 25, 30, 35, 40 }, { 45, 50, 55, 60 }, { 65, 70, 75, 80 } };
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				System.out.print(c[x][y] + " ");
			}
			System.out.println();
		}

	}

}
