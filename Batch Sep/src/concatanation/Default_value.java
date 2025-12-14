package concatanation;

import java.lang.reflect.Array;

public class Default_value {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean e;
	String t; 
	Array[]a;
	
	public static void main(String[] args) {
		Default_value p =new Default_value();
		System.out.println("The default value of byte is " +p.b);
		System.out.println("The default value of short is "+p.s);
		System.out.println("The default value of int is "+p.i);
		System.out.println("The default value of long is "+p.l);
		System.out.println("The default value of float is "+p.f);
		System.out.println("The default value of double is "+p.d);
		System.out.println("The default value of char is "+p.c);
		System.out.println("The default value of boolean is "+p.e);
		System.out.println("The default value of string is "+p.t);
		System.out.println("The default value of Array is "+p.a);
	}

}
