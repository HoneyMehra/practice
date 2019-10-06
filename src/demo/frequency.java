package demo;

import java.util.Map;
import java.util.stream.Collectors;

public class frequency {
public static void main(String[] args) {
	String string = "aasjjikkk ff ";
	int m = Integer.MIN_VALUE;
	
	Map<Character, Long> characterFrequency = string.chars()  // creates an IntStream
	    .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
	    .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // creates a
	     System.out.println(characterFrequency);
	     System.out.println(m);
}
}
