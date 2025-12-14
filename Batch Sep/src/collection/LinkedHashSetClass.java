package collection;



import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> city_name =new LinkedHashSet<String>();
		
		city_name.add("Akola");
		city_name.add("Amravati");
		city_name.add("Bhandara");
		city_name.add("Bid");
		city_name.add("Chandrapur");
		city_name.add("Dhule");
		city_name.add("Jalgaon");
		city_name.add("Kolhapur");
		city_name.add("Mumbai");
		city_name.add("Nagpur");
		city_name.add("Amravati");
		city_name.add("Nashik");
		city_name.add("Pandharpur");
		city_name.add("Pune");
		city_name.add("Ratnagiri");
		city_name.add("Sangli");
		city_name.add("Satara");
		city_name.add("Sevagram");
		city_name.add("Solapur");
		city_name.add("Thane");
		city_name.add("Wardha");
		city_name.add("Yavatmal");
		System.out.println(city_name);
		System.out.println(city_name.clone());
		System.out.println(city_name.contains("Sevagram"));
		System.out.println(city_name.getFirst());
		System.out.println(city_name.getLast());
		System.out.println(city_name.isEmpty());
		city_name.remove("Solapur");
		System.out.println(city_name);
		city_name.removeFirst();
		System.out.println(city_name);
		city_name.removeLast();
		System.out.println(city_name);
		System.out.println(city_name.size());
		city_name.clear();
		System.out.println(city_name);
		
		Iterator<String> i = city_name.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
//		emp_name.add("Anu");
//		emp_name.add("Diya");
//		emp_name.add("Gayu");
//		emp_name.add("Ash");
//		emp_name.add("Aeep");
//		emp_name.add("Anu");
//		emp_name.add(null);
//		System.out.println(emp_name);
//		System.out.println(emp_name.clone());

		
		
//		Iterator<String> i = emp_name.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//            }
//		
		
		
		
		
		
		
		
		
		
		
		
	}

}
