package multiLevelineritance;

public class Class_B extends Class_A {
	char c = 'S';

	public void test() {
		System.out.println("Testing");
	}

	public static void test2() {
		System.out.println("Testing-2");
	}

	public static void main(String[] args) {
		Class_B p =new Class_B();
		p.company();
		p.employee();
		System.out.println(p.a);
		p.test();
		p.test2();
		System.out.println(p.c);

	}

}
