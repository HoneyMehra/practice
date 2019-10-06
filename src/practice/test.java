package practice;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

final class test {

	public static void main(String[] args) {
		
	Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		System.out.println(s);

				
		
		Deque<Integer> d= new LinkedList<Integer>();
		d.add(1);
		d.add(2);
		System.out.println(d);
		System.out.println(d.offer(3));
		System.out.println(d);
		
		int a = d.pollFirst();
		System.out.println("element remove"+a);
		System.out.println(d);
		int b = d.peek();
		System.out.println(b);
		
		
		}

}
	