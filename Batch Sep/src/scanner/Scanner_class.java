package scanner;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("---------Int------");
		System.out.println("enter the first value");
		int a =sc.nextInt();
		System.out.println("enter the second value");
		int b =sc.nextInt();
		System.out.println("Addition of two numbers");
		int c =a+b;
		System.out.println(c);
		
		System.out.println("-------float------");
		System.out.println("enter first value");
		float a1=sc.nextFloat();
		System.out.println("enter second value");
		float b1=sc.nextFloat();
		System.out.println("addition of two value");
		float c1= a1+b1;
		System.out.println(c1);
		
		System.out.println("------double-----");
		System.out.println("enter first value");
		double d= sc.nextDouble();
		System.out.println("enter second value");
		double e =sc.nextDouble();
		System.out.println("substraction of two value");
		double f=d-e;
		System.out.println(f);
		
		System.out.println("-------long------");
		System.out.println("enter first value");
		long g=sc.nextLong();
		System.out.println("enter second value");
		long h=sc.nextLong();
		System.out.println("addition of two values");
		long i=g+h;
		System.out.println(i);
		
		System.out.println("------char-----");
		char j=sc.next().charAt(0);
		System.out.println(j);
		
		System.out.println("------byte----");
		System.out.println("enter first value");
		byte k =sc.nextByte();
		System.out.println("enter second value");
		byte l=sc.nextByte();
		System.out.println("substraction of two number");
		byte m=(byte) (k-l);
		System.out.println(m);
		
		System.out.println("-----short------");
		System.out.println("enter first value");
		short n=sc.nextShort();
		System.out.println("enter second value");
		short o=sc.nextShort();
		System.out.println("enter third value");
		short p=sc.nextShort();
		System.out.println("Total answer of number");
		short q=(short) (n+o-p);
		System.out.println(q);
		
		System.out.println("------string-----");
		System.out.println("enter first word");
		String x =sc.nextLine();
		System.out.println("enter second word");
		String y =sc.nextLine();
		System.out.println("enter sentence");
		String z=x+y;
		System.out.println(z);
				
sc.close();
	}

}
 