package inheritance;

public class Password extends Login {
	int c=45;
	public void manual() {
		System.out.println("Enter manual");
	}

	public static void main(String[] args) {
	//object of parent class
    //we can use parent class ref var to hold or ref the child class object
		Login p = new Login();
		p.test();
		p.test2();
		System.out.println(p.a);
		System.out.println("-------------------------------------------");
      //we can use child class ref var to hold parent class object
		Login x = new Password();
		x.test();
		x.test2();
		System.out.println(x.a);
	}

}
