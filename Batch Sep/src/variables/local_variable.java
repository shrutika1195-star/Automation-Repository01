package variables;

public class local_variable {
     //local variable
	
	//instance method
	public void log() {
		char p = 'S';
		int q = 70;
		System.out.println(p);
		System.out.println(q);
		
		
	}
	public void pass() {
		long t = 2000;
		float u = 6.94f;
		
		System.out.println(t);
		System.out.println(u);
		
	}
	public static void firstname() {
		byte r = 20;
		short s = 92;
		System.out.println(r);
		System.out.println(s);

	}
	public static void lastname() {
		double v = 0.56;
		String w = "Queen";
		System.out.println(v);
		System.out.println(w);

		
	}
	public static void main(String[] args) {
		local_variable z=new local_variable();
		z.log();
		z.pass();
		firstname();
		lastname();
		
	
	}

}
