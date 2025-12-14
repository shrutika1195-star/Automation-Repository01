package methodReturnType;

public class Method_Return_Type {
	// without return statement and no parameters
	public void test() {
		int a = 20;
		short b = 500;
		long l = a + b;
		System.out.println(l);
	}

	// without return type statement and with parameters
	int p ;

	public void type(int q) {
		p = q;
		System.out.println(p);
	}
     //with return statement and parameters
	String k= "shruti";
	public void test2(String s) {
		System.out.println(k);
		return;
	}
	//with return type and parameters
	char s ;
	public static char student(char y) {
		return 's';
	}
	public static void main(String[] args) {
		Method_Return_Type m = new Method_Return_Type();
		m.test();
		m.type(60);
		m.test2("Automation");
		System.out.println('y');
	}

	
}
