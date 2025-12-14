package collection;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> City = new LinkedList<String>();
		City.add("Mumbai");
		City.add("Delhi");
		City.add("Nagpur");
		City.add("Kolhapur");
		City.add("Pune");
		City.add("Amaravati");
		City.add("Wardha");
		City.add(null);
		System.out.println(City);
		System.out.println(City.clone());
		System.out.println(City.contains("Delhi"));
		System.out.println(City.isEmpty());
		City.remove("Delhi");
		System.out.println(City);
		City.addFirst("Yavatmal");
		System.out.println(City);
		City.addLast("Gondia");
		System.out.println(City);
	    City.removeFirst();
		System.out.println(City);
		City.removeLast();
		System.out.println(City);
		System.out.println(City.peekFirst());
		System.out.println(City.peekLast());
		System.out.println(City.size());
		System.out.println(City.getFirst());
		System.out.println(City.getLast());
		System.out.println(City.element());
		City.clear();
		System.out.println(City);
		
         
	}

}
