package package01;

public class Testing {
	// instance method
	public void automation() {
		float f = 0.99f;
		System.out.println(f);
	}

	// static method
	public static void students() {

		double P = 5.65;
		System.out.println(P);
	}

	public void batch() {
		int c = 90;
		int d = 10;
		int e = c + d;
		System.out.println(e);
		System.out.println(d);

	}

	public static void present() {

		char x = 'a';
		System.out.println(x);

	}

	public static void main(String[] args) {
		Testing i = new Testing();

		i.automation();
		students();
		Testing.students();

		i.batch();
		present();
		Testing.present();
	}
}