package linkedlistDemo;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int arr[]=new int[n];
HashMap<Integer,Integer> hm=new HashMap<>();
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt(); 
	hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
System.out.println("cccccccccccc"+hm);
LinkedHashMap<Integer,Integer> reverseSortedMap = new LinkedHashMap<>();

hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
// System.out.println("Reverse Sorted Map : " + reverseSortedMap);
for(Integer i:reverseSortedMap.keySet())
{
int k=reverseSortedMap.get(i);
while(k-->0)
{
System.out.print(i+" ");
}
}
System.out.println();
}
}
}

