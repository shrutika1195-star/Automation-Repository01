package string;

public class StringMethods {

	public static void main(String[] args) {
		String t = "Study";
		// Contains
		System.out.println(t.contains("d"));
		// equals
		String p = "Testing";
		System.out.println(p.equals(t));
		// equalsignorecase
		System.out.println(t.equalsIgnoreCase(t));
		// endwith
		System.out.println(p.endsWith("ing"));
		System.out.println("------------------------------------------");
		// trim
		String q = "   Database Testing   ";
		System.out.println(q.trim());
		System.out.println(q.length());
		String p1 = q.trim();
		System.out.println("original string :" + q);
		System.out.println("Trimmed string :" + p1);
		System.out.println("-----------------------------------------------");

		String s = "Automation and Manual Testing";
		String a = s.substring(3);
		System.out.println(a);
		System.out.println(s.indexOf("m"));
		System.out.println(s.indexOf("M"));
		System.out.println(s.indexOf("a"));
		String b = s.substring(10);
		System.out.println(b);
		System.out.println(b.indexOf("a"));
		String c = s.substring(15);
		System.out.println(c);
		System.out.println(c.indexOf("a"));
		String d = s.substring(17);
		System.out.println(d);
		System.out.println(d.indexOf("a"));

	}

}