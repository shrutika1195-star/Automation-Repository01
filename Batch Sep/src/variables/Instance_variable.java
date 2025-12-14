package variables;

public class Instance_variable {
	// instance variables
	char c = 'A';
	int a = 50;
	byte b = 10;
	short s = 22;
	long l = 1000;
	float f = 10.33f;
	double d = 9.88;
	String z = "automation";

	// instance method
	public void login() {
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);

	}

	public void email() {

		System.out.println(s);
		System.out.println(l);
		System.out.println(f);

	}

	public void password() {

		System.out.println(d);
		System.out.println(z);
	}

	// static method
	public static void home() {
		Instance_variable p = new Instance_variable();
		System.out.println(p.c);
		System.out.println(p.a);
		System.out.println(p.b);
	}

	public static void profile() {
		Instance_variable p = new Instance_variable();
		System.out.println(p.s);
		System.out.println(p.l);
		System.out.println(p.f);

	}

	public static void student() {
		Instance_variable p = new Instance_variable();
		System.out.println(p.d);
		System.out.println(p.z);

	}

	public static void main(String[] args) {
		Instance_variable p = new Instance_variable();
		p.login();
		p.email();
		p.password();
		// static method
		home();
		profile();
		student();

	}

}
