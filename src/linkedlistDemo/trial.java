package linkedlistDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
 * checking parent exception concept
 * 
 * int x=10;
try {
for(int j=2;j>=0;j--) {
	int a= x/j;
	System.out.println("z is"+a);
}
}
catch(ArithmeticException e) {
	System.out.println("E1");
}
catch(Exception e1) {
	System.out.println("e2");
}*/


/*while(1) {
	
}*/


/*
 * Reverse printing of LL
 * 
 * LinkedList<Integer> l = new LinkedList<Integer>();
l.add(12);
l.add(1);
l.add(2);
System.out.println("original list"+l);
LinkedList<Integer> a=reverse(l);
System.out.println("variable is"+a);
}
static LinkedList<Integer> reverse(LinkedList<Integer> l) {
LinkedList<Integer> a1=new LinkedList<Integer>();
for(int i=l.size()-1;i>=0;i--) {
if(l.size()==0) {
	return a1;
}
else {
	int z=l.get(i);
	a1.add(z);
}
}
return a1;*/

public class trial {
	static LinkedList<Integer> l = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		l.add(12);
		l.add(22);
		l.add(20);
		System.out.println("original list is"+l);
		System.out.println("list after reversal");
		Iterator it=l.descendingIterator();
		it.forEachRemaining(name->System.out.println(name));
	
	}
}
