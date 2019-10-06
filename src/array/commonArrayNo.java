package array;

import java.util.ArrayList;
import java.util.HashMap;

public class commonArrayNo {	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] a = {1,1,2,3,4,4};
		int b[] = {1,1,1,4,5,6,3};
		//int x[] = new int[4];
		ArrayList<Integer> c = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					/*if(c.contains(a[i])) {
						break;
					}
					else {*/
						c.add(a[i]);
						break;
					//}
					
				}
				else
					continue;
			}
		}
		
			System.out.println("common elements are:"+c);
		
	}

}
