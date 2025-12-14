package array;

public class Array_03 {

	public static void main(String[] args) {
		// multi diamentional-by allocating memory
		// syntax: datatype[][]arrayname=datatype[row_size][col_size];

		int[][] a = new int[2][3];
		// row o-1 outer loop
		// column 0-2 inner loop
		a[0][0] = 5;
		a[0][1] = 10;
		a[0][2] = 15;

		a[1][0] = 20;
		a[1][1] = 25;
		a[1][2] = 30;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("value at index is as" + a[1][1]);
		System.out.println("------------------------------");

		int[][] x = new int[3][4];
		
		x[0][0] = 30;
		x[0][1] = 10;
		x[0][2] = 20;
		x[0][3] = 15;
		
		x[1][0] = 90;
		x[1][1] = 45;
		x[1][2] = 50;
		x[1][3] = 10;
		
		x[2][0] = 20;
		x[2][1] = 35;
		x[2][2] = 40;
		x[2][3] = 80;
		
		for(int p=0; p<3; p++) {
			for(int q=0; q<4; q++) {
				System.out.print(x[p][q]+" ");
				}
			System.out.println();
		}
		System.out.println("value at index is as" + x[2][3]);
		System.out.println("------------------------------");
		int[][] y = new int[5][6];
		
		y[0][0] = 0;
		y[0][1] = 1;
		y[0][2] = 0;
		y[0][3] = 1;
		y[0][4] = 0;
		y[0][5] = 1;
		
		y[1][0] = 1;
		y[1][1] = 2;
		y[1][2] = 1;
		y[1][3] = 2;
		y[1][4] = 1;
		y[1][5] = 2;
		
		y[2][0] = 2;
		y[2][1] = 3;
		y[2][2] = 2;
		y[2][3] = 3;
		y[2][3] = 2;
		y[2][3] = 3;
		

		y[3][0] = 3;
		y[3][1] = 4;
		y[3][2] = 3;
		y[3][3] = 4;
		y[3][4] = 3;
		y[3][5] = 4;
		
		y[4][0] = 4;
		y[4][1] = 5;
		y[4][2] = 4;
		y[4][3] = 5;
		y[4][4] = 4;
		y[4][5] = 5;
		
		for(int m=0; m<5; m++) {
			for(int n=0; n<6; n++) {
				System.out.print(y[m][n]+" ");
			}
			System.out.println();
		}
		System.out.println("value at index is as" + y[4][5]);
		
		
		

	}

}
