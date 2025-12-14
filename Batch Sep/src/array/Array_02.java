package array;

public class Array_02 {

	public static void main(String[] args) {
		// single diamensional
		// without allocating memory
		float[] a = { 10.2f, 20.3f, 30.4f, 40.5f, 50.6f };
		// for each loop
		for (float b : a) {
			System.out.println(b);
		}
		System.out.println("--------------------------------");

		String[] city = { "Nagpur", "Mumbai", "Pune", "Hydrabad", "Kolhapur" };
		for (String Metro : city) {
			System.out.println(Metro);
			}
		System.out.println("-----------------------------");
		
		int [] x = {2,4,3,5,6,8};
		for(float y:x) {
			System.out.println(y);
		}
		
		
		
		
		
	}

}
