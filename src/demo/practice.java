package demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice {
	/*public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");

		Set<String> keySet = map.keySet();
		System.out.println(keySet);

		map.put("4", "4");
		System.out.println(keySet);
		
		keySet.remove("1");
		System.out.println(map); // map is also modified

		keySet = new HashSet<>(map.keySet()); // copies the key to new Set
		map.put("5", "5");
		System.out.println(keySet); */
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		int a[];
		map.put("1", "1"); // put example
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", null); // null value
		map.put(null, "100");
		map.put(null, null);// null key

		String value = map.get("3"); // get example
		System.out.println("Key = 3, Value = " + value);
		
		Set<String> keyset = map.keySet();
		System.out.println(keyset);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		Object s[]=map.keySet().toArray();
		System.out.println(s.getClass().getName());
		for(int j=0;j<s.length;j++) {
			System.out.println("sssssssssssssssssss"+s[j]);
		}
}
}
