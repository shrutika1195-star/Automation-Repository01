package constructor;

public class UserDefinedConstructor {
	// user defined
	public UserDefinedConstructor() {
		System.out.println("UserDefinedConstructor");

	}

	public void Username() {
		System.out.println("Insatance Method");
	}
	public static void login() {
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
		
		UserDefinedConstructor a =new UserDefinedConstructor();
		a.Username();
		login();

	}

}
