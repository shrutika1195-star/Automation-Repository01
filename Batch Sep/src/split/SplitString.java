package split;

public class SplitString {

	public static void main(String[] args) {
		String s = "STP Institute";
		String[] d = s.split("P");     //string is converted into array
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		

	}

}
