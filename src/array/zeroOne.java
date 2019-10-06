package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class zeroOne {

	public static void main(String[] args) {
		/*
		 * String num="101010100101010"; String zerono = ""; String oneno="";
		 * num.chars().forEach(j -> System.out.print((char)j));
		 * //num.chars().forEachOrdered(j -> System.out.print((char)j)); for(int
		 * i=0;i<num.length();i++) { //IntStream x=num.chars(); //System.out.println(x);
		 * 
		 * char a=num.charAt(i); if(a=='0') { zerono=zerono+a; } else { oneno=oneno+a; }
		 * 
		 * } System.out.println("dsddsdsd"+zerono+oneno);
		 */

		
		 int a[]= {1,0,0,1,0,1,1,0,1,1,1,1,0,1}; 
		 int swap; 
		 for(int i=0;i<a.length;i++)
		 {
		  
		  for(int j=0;j<a.length-1;j++) 
		  {
			  if(a[i]<a[j]) 
			  { 
				  swap=a[i]; 
				  a[i]=a[j];
				  a[j]=swap; 
		  }
			  }
		 }
		  System.out.println("ssssssssssssssssssssssssss");
		  Arrays.stream(a).forEach(i->System.out.println(i));
		 
		
		/*
		 * int a[]= {1,0,1,0,0,1,1,0}; for(int i=1;i<a.length;i++) { int j=i-1;
		 * while(j>-1 && a[i]>a[j]) { a[j]=a[i]; }
		 * 
		 * } Arrays.stream(a).forEach(action);
		 */
	}
	
	
	

}
