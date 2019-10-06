package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		//int num = sc.nextInt();
		int num = 8237;
		largest(num);
		
	}
	static void largest(int num) {
		
		ArrayList<Integer> c= new ArrayList<Integer>();
		//c.add(num);	
		
		while(num!=0) {
			int c1 = num%10;
			c.add(c1);
			num = num/10;
		}
		
		System.out.println("array list is");
		System.out.println(c);
		//Object aa[]=c.toArray();
		
		//System.out.println(aa);
		for(int i=1;i<c.size();i++) {
			System.out.println(c.indexOf(i));
			if(c.get(i)<c.get(i+1)) {
				int z = i;
				break;
			}
			else {
				
			}
		}
		//return num;
		
	}
	static void getDigit(int a) {
		
	}
}


/*
 * public class nextGreater  
{ 
    // Utility function to swap two digit 
    static void swap(char ar[], int i, int j)  
    { 
        char temp = ar[i]; 
        ar[i] = ar[j]; 
        ar[j] = temp; 
    } 
  
    // Given a number as a char array number[],  
    // this function finds the next greater number.  
    // It modifies the same array to store the result 
    static void findNext(char ar[], int n)  
    { 
        int i; 
          
        // I) Start from the right most digit  
        // and find the first digit that is smaller  
        // than the digit next to it. 
        for (i = n - 1; i > 0; i--)  
        { 
            if (ar[i] > ar[i - 1]) { 
                break; 
            } 
        } 
          
        // If no such digit is found, then all  
        // digits are in descending order means  
        // there cannot be a greater number with  
        // same set of digits 
        if (i == 0)  
        { 
            System.out.println("Not possible"); 
        }  
        else 
        { 
            int x = ar[i - 1], min = i; 
              
            // II) Find the smallest digit on right  
            // side of (i-1)'th digit that is greater  
            // than number[i-1] 
            for (int j = i + 1; j < n; j++)  
            { 
                if (ar[j] > x && ar[j] < ar[min])  
                { 
                    min = j; 
                } 
            } 
  
            // III) Swap the above found smallest  
            // digit with number[i-1] 
            swap(ar, i - 1, min); 
  
            // IV) Sort the digits after (i-1)  
            // in ascending order 
            Arrays.sort(ar, i, n); 
            System.out.print("Next number with same" + 
                                    " set of digits is "); 
            for (i = 0; i < n; i++) 
                System.out.print(ar[i]); 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        char digits[] = { '5','3','4','9','7','6' }; 
        int n = digits.length; 
        findNext(digits, n); 
    } 
} 

 * */
 