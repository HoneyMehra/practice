package array;

import java.util.Arrays;

public class zeroOneSingleLoop {

	public static void main(String[] args) {
		/*int a[]= {1,0,0,1,0,1,1,0,1,1,1,1,0,1};
		for(int i = 0, j=i+1; i < a.length && j<a.length;)
	    {       
	        if(a[i] > a[j])
	        {
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;              
	            i=0;
	            j=i+1;
	        } 
	        else
	        {
	            i++;
	            j++;
	        }
	    }
		Arrays.stream(a).forEach(z->System.out.println(z));
	*/
	
		int a[]= {1,0,0,1,0,1,1,0,1,1,1,1,0,1};
		for(int i=0, j=a.length-1;i<a.length-1 && j>0;i++,j--)
		{
			if(a[j] < a[j-1])
	        {
	            int z = a[j];
	            a[j] = a[j-1];
	            a[j-1] = z;     
	            
	        }
			if(a[i] > a[i+1])
	        {
	            int temp = a[i];
	            a[i] = a[i+1];
	            a[i+1] = temp;   
	        } 
			
			
			
		}
		System.out.println("..................................................");
		Arrays.stream(a).forEach(z->System.out.println(z));
	
	
	}

}
