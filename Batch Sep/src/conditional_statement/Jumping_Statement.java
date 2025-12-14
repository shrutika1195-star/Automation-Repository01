package conditional_statement;
public class Jumping_Statement {

	public static void main(String[] args) {
		
		 
		  for (int b =1; b<= 25; b++) {
			  
			  System.out.print(b + " ");
			  
			  if (b== 20) {
				  
				  break;
				  
			  }
			  
		 }
		  System.out.println();
		  System.out.println("----------------even number---------------");
		  
		  for (int a=1; a<=40; a++) {
			  
			  if (a%2==0) {
				  
				  System.out.print(a+ " ");
				  
				  if (a==30) {
					  
					  break;
				  }
			  }
		  }
		  
		  System.out.println();
		  System.out.println("-----------------odd number----------------");
		  
		  for (int d=1; d<=50; d++) {
			  
			  if (d%2!=0) {
				  
				  System.out.print(d+ " ");
				  
				  if (d==39) {
					  
					  break;
				  }
			  }
		  }
		  
		  System.out.println();
		  System.out.println("-----------------------decrease number------------");
		  
		  int e= 60;
		  
		  do {
			  
			  System.out.print(e +" ");
			  
			  if (e==10) {
				  
				  break;
			  }
			  
			  e--;
			  
		  } while (e>=1);

	}

}