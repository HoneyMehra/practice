package linkedlistDemo;

import java.util.LinkedList;

public class test {

	public static void main(String[] args) {
		//char a[] = {'a','b','c','d'};
		LinkedList<Character> a = new LinkedList<Character>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		System.out.println("original list"+a);
		int count=0;
		for (int i=0; i<a.size(); i++)
		{
			char aw=a.pop();
			System.out.println("character is"+aw);
			//a.push(aw);
			a.addLast(aw);
			System.out.println("list is"+a);
			count++;
		}
		System.out.println("count is"+count);
	}

}
