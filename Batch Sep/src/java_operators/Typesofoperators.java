package java_operators;

public class Typesofoperators {

	public static void main(String[] args) {
		// arithmatic operator
		// addition
		int a = 90;
		byte b = 80;
		long c = a + b;
		System.out.println("The addition  will be:- " + c);

		// substraction
		byte e = 50;
		short f = 60;
		int g = e + f;
		System.out.println("The substraction will be:- " + g);

		// multiplication
		float h = 90.50f;
		double i = 3.4;
		double j = h * i;
		System.out.println("The multiplication will be:- " + j);

		// Division
		// for quotiont
		int k = 400;
		short l = 25;
		long m = 400 / 25;
		System.out.println("The division will be:- " + m);
		// for reminder
		long n = k % l;
		System.out.println("The division will be:-" + n);

		System.out.println("----------------------------------------");

		// Assignment operator
		float o = 50.69f;
		System.out.println(o + 6);
		System.out.println(o - 3);
		System.out.println(o / 5);
		System.out.println(o * 40);

		System.out.println("---------------------------------------------");

		//comparison operator
		short p = 300;
		long q = 200;
		
		boolean r = p>q;
		System.out.println(r);
		 
		boolean s= p<q;
		System.out.println(s);
		
		boolean t = p>=q;
		System.out.println(t);
		
		boolean u = p<=q;
		System.out.println(u);
		
		boolean v = p==q;
		System.out.println(v);
		
		boolean w = p!=q;
		System.out.println(w);
		System.out.println("---------------------------------------------------");
		
		//logical operator
		//AND &&
		//T   T-T
		int x = 800;
		int y = 400;
		boolean z= x>y&&y<x;
		System.out.println(z);
		//T   F-F
		boolean z1 = x>y&&x<y;
		System.out.println(z1);
		//F   T-F
		boolean z2 =x<y&&x>y;
		System.out.println(z2);
		//F   F-F
		boolean z3 =x<y&&y>x;
		System.out.println(z3);
		System.out.println("--------------------------------------------");
		
		//OR ||
		byte b1 =30;
		short s1 = 50;
		//T   T- T
		boolean c1= b1<s1||s1>b1;
		System.out.println(c1);
		//T   F- T
		boolean c2 =b1<s1||s1<b1;
		System.out.println(c2);
		//F   T- T
		boolean c3 = b1>s1||s1>b1;
		System.out.println(c3);
		//F   F- F
		boolean c4 = b1>s1||s1<b1;
		System.out.println(c4);
		System.out.println("---------------------------------------");
	
		//NOT !
		
		int p1 =500;
		System.out.println(p1!=500);
		
	}

}
