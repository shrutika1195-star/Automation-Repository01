package thiskeyword;

public class ThisKeyword {
	int a = 50;
	String s = "Manual";
	static char c = 'K';

	public ThisKeyword() {
		this.login();
		System.out.println(this.a);
		System.out.println(this.s);
		System.out.println(this.c);
		System.out.println("User defined constructor");
	}

	public void login() {
		this.password();
		System.out.println(this.c);
		System.out.println("Instance method");
	}

	public static void password() {
		
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		ThisKeyword d = new ThisKeyword();

	}

}
