package array;

public class Array_01 {

	public static void main(String[] args) {
		//single dimention with allocating memory
		String[] fruit = new String [10];
		
		fruit[0]="Mango";
		fruit[1]="Apple";
		fruit[2]="Banana";
		fruit[3]="Orange";
		fruit[4]="Cherry";
		fruit[5]="Pineapple";
		fruit[6]="Grapes";
		fruit[7]="Strawberries";
		fruit[8]="Avacados";
		fruit[9]="Blueberry";
		for(String b:fruit) {
			System.out.println(b);
		}
		System.out.println("length odf array is:"+fruit.length);
		System.out.println("Value at index is:"+fruit[6]);
		System.out.println("------------------");
		for(int p=0; p<10; p++) {
			System.out.println(fruit[p]);
		}
		System.out.println("------------------------------------------");
		//memory allocation 4byte*8=32
		int[]a=new int[8];
		a[0]=90;
		a[1]=80;
		a[2]=70;
		a[3]=60;
		a[4]=50;
		a[5]=40;
		a[6]=30;
		a[7]=20;
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("Length of array is:"+a.length);
		System.out.println("value at index is:"+a[2]);
		System.out.println("------------------------------------");
		char letters[]=new char[12];
		 letters[0]='z';
		 letters[1]='y';
		 letters[2]='x';
		 letters[3]='w';
		 letters[4]='v';
		 letters[5]='u';
		 letters[6]='t';
		 letters[7]='s';
		 letters[8]='r';
		 letters[9]='q';
		 letters[10]='p';
		 letters[11]='o';
		 for(char c:letters) {
			 System.out.println(c);
		 }
		System.out.println("Length of array is:"+letters.length);
		System.out.println("Value at index is:"+letters[9]);
		System.out.println("-----------------------------------");
	
		
		byte d[]=new byte[15];
		d[0]=10;
		d[1]=20;
		d[2]=30;
		d[3]=40;
		d[4]=50;
		d[5]=60;
		d[6]=70;
		d[7]=80;
		d[8]=90;
		d[9]=100;
		d[10]=105;
		d[11]=106;
		d[12]=107;
		d[13]=108;
		d[14]=109;
		for(byte e:d) {
			System.out.println(e);
		}
		System.out.println("Length of array is:"+d.length);
		System.out.println("Value at index is"+d[11]);
		
		
		
				

	}

}
