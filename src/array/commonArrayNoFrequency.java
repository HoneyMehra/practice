package array;

import java.util.HashMap;
import java.util.Map;

public class commonArrayNoFrequency {

	public static void main(String[] args) {
		int a[]= {1,1,1,1,2,2,3,5};
		int b[] = {1,1,1,1,1,2,2,2,3,3,8};
		int count=0;
		
		HashMap<Integer, Integer> aMap= new HashMap<>();
		HashMap<Integer, Integer> bMap= new HashMap<>();
		HashMap<Integer, Integer> cMap= new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(aMap.containsKey(a[i])){
				count=0;
				continue;
			}
			else {
				aMap.put(a[i],count+1);
			}
		for(int j=i+1;j<a.length;j++) {	
			if(a[i]==a[j])
			{				
				count=count+1;
				aMap.put(a[i],count);
			}
			else {
				aMap.put(a[i],count+1);
			}
		}
		}
		System.out.println(aMap);
		
		for(int i=0;i<b.length;i++) {
			if(bMap.containsKey(b[i])){
				count=0;
				continue;
			}
			else {
				bMap.put(b[i],count+1);
			}
		for(int j=i+1;j<b.length;j++) {	
			if(b[i]==b[j])
			{				
				count=count+1;
				bMap.put(b[i],count);
			}
			else {
				bMap.put(b[i],count+1);
			}
		}
		}
		System.out.println(bMap);
		
	//first.entrySet().stream().allMatch(e -> e.getValue().equals(second.get(e.getKey())));	
		for(Map.Entry<Integer, Integer> entry:aMap.entrySet()) {
			for(Map.Entry<Integer, Integer> entry1:bMap.entrySet()) {
				int x=entry.getKey();
				int y=entry1.getKey();
				int n=entry.getValue();
				int m=entry1.getValue();
				if(x== y) {
					if(n==m) {
						cMap.put(x, n);
					}
					else if(n>m) {
						cMap.put(x, m);
					}
					else {
						cMap.put(x, n);
					}
				}
				else {
					cMap.put(x,n);
					cMap.put(y,m);
				}
			}
		}
		System.out.println(cMap);
		
		
	}

}
