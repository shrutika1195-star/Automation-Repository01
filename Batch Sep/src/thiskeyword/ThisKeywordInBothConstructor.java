package thiskeyword;

public class ThisKeywordInBothConstructor {
	public ThisKeywordInBothConstructor() {
       this(50.3);
		System.out.println("User defined constructor");

	}

	public ThisKeywordInBothConstructor(int a) {
		this("Automation");
		System.out.println("Parameterized constructor int");
	}

	public ThisKeywordInBothConstructor(double b) {
		this('S');
		System.out.println("Parameterized constructor double");
	}

	public ThisKeywordInBothConstructor(float f) {
		this(60);
		System.out.println("Parameterized constructor float");
	}

	public ThisKeywordInBothConstructor(char c) {
		this(55.6f);
		System.out.println("Parameterized constructor char");
	}

	public ThisKeywordInBothConstructor(String s) {
		System.out.println("Parameterized constructor String");
	}

	public static void main(String[] args) {
		ThisKeywordInBothConstructor p = new ThisKeywordInBothConstructor();
	}

}
