package package01;

public class Method_arguments {
	int a;
	short s;
	long l;
	float f;
	double d;
	int c;
	int p;
	double x;
	public void argument(int b,short r,long m,float o, double e,int h,int g,double y) {
		a=b;
		System.out.println(a);
		s=r;
		System.out.println(s);
		l=m;
		System.out.println(l);
		f=o;
		System.out.println(f);
		d=e;
		System.out.println(d);
		c=h;
		System.out.println(c);
		p=g;
		System.out.println(p);
		x=y;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Method_arguments n=new Method_arguments();
		n.argument(20, (short) 50, 100, 9.22f, 4.76,10,55,3.14);
		

	}

}
