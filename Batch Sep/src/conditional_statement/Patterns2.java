package conditional_statement;

public class Patterns2 {

	public static void main(String[] args) {
	
				
		System.out.println("--------------Triangle pattern-----------");
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}System.out.println();
		}
		System.out.println("----------------Floyds Triangle------------");
		//floyds triangle
		int b=1;
		for(int r=1; r<=6; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}
	
		
		//inverted half pyramid rotated by 180
				System.out.println("------inverted half pyramid rotated by 180------");
				
				for(int k=1;k<=5;k++) {
					for(int l=1;l<=5-k;l++) {
						System.out.print(" ");
					}
						for(int m=1;m<=k;m++) {
							
						System.out.print("*");
					}System.out.println();
	}
	}
}
