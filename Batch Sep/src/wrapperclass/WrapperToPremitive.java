package wrapperclass;

public class WrapperToPremitive {

	public static void main(String[] args) {
		Long l = new Long(400);
		long d =l.longValue();
		System.out.println(d);
		  
		Float f = new Float(55.60f);
		float b =f.floatValue();
		System.out.println(b);
		

	}

}
