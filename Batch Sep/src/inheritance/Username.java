package inheritance;

public class Username extends Login{
	int b = 60;
	public void test3() {
		System.out.println("Enter Test3");
	}

	public static void main(String[] args) {
		//create object of child class
	Username o =new Username();
	o.test();
	o.test2();
	System.out.println(o.a);
    o.test3();
    System.out.println(o.b);
	}

}
