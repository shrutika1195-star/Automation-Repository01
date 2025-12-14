package collection;

import java.util.ArrayList;

public class ArraylistClass {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Pear");
		fruits.add("Tomato");
		fruits.add(null);
		System.out.println(fruits);
		System.out.println(fruits.clone());
		System.out.println(fruits.contains("Pear"));
		System.out.println(fruits.isEmpty());
		fruits.remove("Tomato");
		System.out.println(fruits);
		fruits.addFirst("Apple");
		System.out.println(fruits);
		fruits.addLast("Tomato");
		System.out.println(fruits);
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		System.out.println(fruits.get(5));
		System.out.println(fruits.size());
		fruits.clear();
		System.out.println(fruits);
		

	}

}
