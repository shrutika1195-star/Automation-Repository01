package string;

public class Methods_in_string {

	public static void main(String[] args) {
		// Methods in string

		String s = "Automation Testing";
		String h = "";
		// IsEmpty
		System.out.println("The output of IsEmpty method is: " + s.isEmpty());
		System.out.println("The output of IsEmpty method is:" + h.isEmpty());

		// length
		System.out.println("The output of Length method is: " + s.length());
		System.out.println("The output of Length method is: " + h.length());

		// IndexOf
		System.out.println("The output of IndexOf method is: " + s.indexOf("o"));
		System.out.println("The output of IndexOf method is: " + s.indexOf("T"));
		System.out.println("The output of IndexOf method is: "+s.indexOf(" "));
		
		//Replace
		System.out.println("The output of Replace method is:"+s.replace("Testing", "Engineer"));
		System.out.println("The output of Replace method is:"+s.replace("Automation", "Manual"));
	
		//CharAt
		System.out.println("The output of CharAt method is:"+s.charAt(5));
		System.out.println("The output of CharAt method is:"+s.charAt(10));
		System.out.println("The output of CharAt method is:"+s.charAt(11));
		
		//ToLowerCase
		String p ="NAGPUR";
		System.out.println("The output of ToLowerCase method is:"+p.toLowerCase());
		
		//ToUpperCase
		String q ="wardha";
		System.out.println("The output of ToUpperCase method is:"+q.toUpperCase());
		
		//SubString 
		System.out.println("The output of Substring method is:"+s.substring(10));
		System.out.println("The output of Substring method is:"+s.substring(10, 15));
		
		
		
		
		
		
				
	}

}
