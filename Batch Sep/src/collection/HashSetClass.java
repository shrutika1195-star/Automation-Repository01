package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {

//		HashSet<Integer> emp_id = new HashSet<Integer>();
//		for (int i = 1; i <= 250; i++) {
//			emp_id.add(i);
//
//		}
//		System.out.println(emp_id);
//		System.out.println(emp_id.clone());
//		System.out.println(emp_id.contains(200));
//		System.out.println(emp_id.isEmpty());
//	    System.out.println(emp_id.size());
//	    System.out.println(emp_id.remove(40));
//	    emp_id.clear();
//	    System.out.println(emp_id);
//		
		
		
		HashSet<String> Flowers_name = new HashSet<String>(); 
	
		Flowers_name.add("Rose");
		Flowers_name.add("Lotus");
		Flowers_name.add("Sunflower");
		Flowers_name.add("Marigold");
		Flowers_name.add("Jasmine");
		Flowers_name.add("Hibiscus");
		Flowers_name.add("Lily");
		Flowers_name.add("Tulip");
		Flowers_name.add("Orchid");
		Flowers_name.add("Mogra");
		Flowers_name.add("null");
		
		Iterator<String> i =Flowers_name.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
//		emp_id.add(500);
//		emp_id.add(300);
//		emp_id.add(400);
//		emp_id.add(700);
//		emp_id.add(500);
//		
//		//iterator
//	    Iterator<Integer> i = emp_id.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//			
//		}
//		
		
		
		
		
	}
	
}
