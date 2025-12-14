package conditional_statement;

public class Nested_for_loop {

	public static void main(String[] args) {
		// 4 society ---and 4flat in each society
		for (int i = 1; i <= 4; i++) {
			System.out.println("Society" + i);
			for (int a = 1; a <= 4; a++) {
				System.out.println("Flat" + a);
			}
		}
System.out.println("-------------------------");
		// solid rectangle
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		//numbers
		
		for (int c = 1; c <= 6; c++) {
			for (int d = 1; d <= 7; d++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
		for (int e = 1; e <= 6; e++) {
			for (int f = 1; f <= 7; f++) {
				System.out.print(f+" ");
			}
			System.out.println();
		}
		
		
		//Hollow rectangle
		for(int f=1; f<=4; f++ ) {
			for(int g=1; g<=5; g++) {
				if(f==1|| f==4|| g==1||g==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		System.out.println("-----------------------");
		//half pyramid
		
		for(int h=1; h<=4; h++) {
			for(int j=1; j<=h; j++) {
				System.out.print("* ");
				
			}System.out.println();
		}
		System.out.println("--------------------");
		

		for(int k=1; k<=5; k++) {
			for(int l=1; l<=k; l++) {
				System.out.print(l+" ");
				
			}System.out.println();
		}
		
		
		//inverted pyramid
		for(int x=4; x>=1; x--) {
			for(int y=1; y<=x; y++) {
				System.out.print("* ");
			}
		
		System.out.println();
		
		}

	}

}
