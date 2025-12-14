package array;

public class DuplicatesArray {

	public static void main(String[] args) {
//		int[] a = { 250, 500, 650, 400, 150, 400, 250, 300, 500, 900, 650, 800, 250 };
//		int num = 250;
//		int count = 0;
//
//		for (int values : a) {
//			if (values == num) {
//				count++;
//			}
//		}
//		System.out.println("Duplicates of array:" + count);
//		System.out.println("----------------------------");

		int[] a = { 300, 200, 200, 200, 100, 200, 300, 200, 400, 600, 800, 900, 800 };
		int num = 200;
		int count = 0;
		for (int values : a) {
			if (values == num) {
				count++;
			}
			//System.out.println("Duplicates in array:"+count);
		}
		//System.out.println("--------------------------------");
		System.out.println("Duplicates in array:"+count);
	}

}
