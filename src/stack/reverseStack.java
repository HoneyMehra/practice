package stack;

import java.util.Stack;

public class reverseStack {

	static Stack<Character> st = new Stack<Character>();
	public static void main(String[] args) {
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		System.out.println(st);
		reverse();
		System.out.println("after reverse");
		System.out.println(st);
	}
	
	static void reverse() {
		if(st.size()>0) {
		char c = st.peek();
		st.pop();
		reverse();
		insert_bottom(c);
		}
	}
	
	static void insert_bottom(char c) {
		if(st.isEmpty()) {
			st.push(c);
		}
		else {
			char a=st.peek();
			st.pop();
			insert_bottom(c);
			st.push(a);
		}
	}
}
