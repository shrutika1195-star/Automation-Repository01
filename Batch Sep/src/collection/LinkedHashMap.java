package collection;

import java.util.HashMap;

public class LinkedHashMap {

	public static void main(String[] args) {
		HashMap<Character, Character>char_char = new HashMap<Character, Character>();
		char_char.put(null, null);
		char_char.put('A', 'a');
		char_char.put('B', 'b');
		char_char.put('C', null);
		char_char.put('D', 'd');
		char_char.put('E', 'e');
		char_char.put('F', 'f');
		char_char.put(null, 'g');
		char_char.put('G', 'g');
		char_char.put(null, 'c');
		char_char.put('H', 'h');
		char_char.put('I', 'i');
		System.out.println(char_char);
		System.out.println(char_char.clone());
		System.out.println(char_char.containsKey('G'));
		System.out.println(char_char.containsValue('p'));
		System.out.println(char_char.isEmpty());
		System.out.println(char_char.remove('D', 'e'));
		char_char.replace('G', 'g', 'P');
		System.out.println(char_char);
		System.out.println(char_char.size());
		System.out.println(char_char.get('I'));
		System.out.println(char_char.getOrDefault('H', null));
		System.out.println(char_char.putIfAbsent('C', null));
		char_char.clear();
		System.out.println(char_char);
		
		

	}

}
