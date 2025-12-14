package scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a = sc.nextInt();
	System.out.println("Enter second number");
	int b = sc.nextInt();
	char c = sc.next().charAt(0);
	switch (c) {
	case '+':
		System.out.println("Addition of two number is"+(a+b));
		break;
	case '-':
		System.out.println("Substraction of two number is"+(a-b));
		break;
	case '*':
		System.out.println("Multiplition of two number is"+(a*b));
		break;
	case '/':
		System.out.println("Division of two number is"+(a/b));
		break;
	case '%':
		System.out.println("Mod of two number is"+(a%b));
		break;
	default:
		System.out.println("None");
		break;
	}


	}

}
