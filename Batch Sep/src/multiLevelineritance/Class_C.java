package multiLevelineritance;

public class Class_C extends Class_B{
	String x = "Automation Testing";


	public static void main(String[] args) {
		Class_C y =new Class_C();
		y.company();
		y.employee();
		y.test();
		y.test2();
		System.out.println(y.a);
		System.out.println(y.c);
		System.out.println(y.x);

	}

}
