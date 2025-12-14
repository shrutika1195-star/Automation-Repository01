package variables;

public class Typesofvariable {
	
	//instance variable
	char a = 'P';
	int b = 100;
	byte c = 20;
	
	//static variable
	static short d = 95;
	static long e = 500;
	static float f = 0.234f;
	
	 //instance method
	public void home() {
		//instance variable
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//static variable
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		//local variable
		double p = 9.33;
		String q = "Testing";
		System.out.println(p);
		System.out.println(q);
	}
	//static method
	public static void page() {
		//instance variable
		Typesofvariable r=new Typesofvariable();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);
		//static variables
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		//local variable
		int x=90;
		long y= 6000;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Typesofvariable r=new Typesofvariable();
		r.home();
		page();
		
	}

}
