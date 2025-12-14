package collection;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, String>Name_city = new HashMap<String, String>();
		Name_city.put(null, null);
		Name_city.put("Sanju", "Nagpur");
		Name_city.put("Anju", "Wardha");
		Name_city.put("Anu", "Hinganghat");
		Name_city.put("Ritu", "Mumbai");
		Name_city.put("Pihu","Pune");
		Name_city.put(null, "Wardha");
		Name_city.put("Sanju", null);
		Name_city.put("Kitty", "Bhandara");
		Name_city.put("Sweety", "Yavatmal");
		Name_city.put("Appi", "Chandrapur");
		Name_city.put("Riddhi", "Kolhapur");
		System.out.println(Name_city);
		System.out.println(Name_city.clone());
		System.out.println(Name_city.containsKey("Wardha"));
		System.out.println(Name_city.containsValue("Anu"));
		System.out.println(Name_city.get("Mumbai"));
		System.out.println(Name_city.getOrDefault("Wardha", null));
		System.out.println(Name_city.isEmpty());
		Name_city.putIfAbsent("Kruti", null);
		System.out.println(Name_city);
		System.out.println(Name_city.size());
		Name_city.remove("Kolhapur");
		System.out.println(Name_city);
		Name_city.remove("null", "Wardha");
		System.out.println(Name_city);
		System.out.println(Name_city.replace(null, null));
		System.out.println(Name_city.replace("Anu", "Hinganghat", "Akola"));
		Name_city.clear();
		System.out.println(Name_city);
	
	}

}
