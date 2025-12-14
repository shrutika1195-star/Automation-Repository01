package variables;

public class static_variable {

	// static variables
	static char a = 'X';
	static int b = 90;
	static byte c = 30;
	static short d = 45;
	static long e = 900;
	static float f = 6.98f;
	static double g = 5.67;
	static String h = "STP";

	// instance method
	public void student() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

	public void teacher() {
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

	public static void name() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void home() {
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

	public static void main(String[] args) {
		static_variable m = new static_variable();
		m.student();
		m.teacher();
		name();
		home();
	}

}
