package singleInheritance;

public class Class_B extends Class_A{
	int i = 50;
	public void num() {
		System.out.println("Numbers");
	}

	public static void main(String[] args) {
		Class_B a = new Class_B();
		a.name();
		a.Id();
		System.out.println(a.s);
		a.num();
		System.out.println(a.i);

	}

}
