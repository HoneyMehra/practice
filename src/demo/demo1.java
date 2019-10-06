package demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String name = c.nextLine();
		int count = 0;
		HashMap<Character, Integer> h1= new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++) {
			char c1 = name.charAt(i);
			if(h1.containsKey(c1)) {
				h1.put(c1, h1.get(c1)+1);
			}
			else
			{
				h1.put(c1, 1);
			}
		}
		System.out.println(h1);
		
//		for(int i=1;i<h1.size();i++) {
//			int highest = 0 ;
//			if(h1.get(i)>highest) {
//				highest= h1.get(i);
//			}
//			System.out.println("highest no "+highest);
		
		Map.Entry<Character, Integer> entry = (Entry<Character, Integer>) h1.entrySet();
		
			
		}
	}

}
