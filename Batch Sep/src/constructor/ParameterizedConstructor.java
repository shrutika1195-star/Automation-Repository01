package constructor;

public class ParameterizedConstructor {
	public ParameterizedConstructor(int a, float b, String c, char d) {
		System.out.println("ParameterizedConstructor");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
		System.out.println("Value of d is "+d);
	}

	public static void main(String[] args) {
		ParameterizedConstructor p =new ParameterizedConstructor( 50, 90.6f,"Automation", 'K');

	}

}
