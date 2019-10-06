package demo;

import java.util.ArrayList;

/*class GFG 
{ 
    // A recursive binary search based function.  
    // It returns index of x in given array  
    // arr[l..r] is present, otherwise -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) 
        { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at  
            // one of the middle 3 positions 
            if (arr[mid] == x)  
                return mid; 
            if (mid > l && arr[mid - 1] == x) 
                return (mid - 1); 
            if (mid < r && arr[mid + 1] == x) 
                return (mid + 1); 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x)  
                return binarySearch(arr, l, mid - 2, x); 
  
            // Else the element can only be present  
            // in right subarray 
            return binarySearch(arr, mid + 2, r, x); 
        } 
  
        // We reach here when element is  
        // not present in array 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        GFG ob = new GFG(); 
        int arr[] = {3, 4, 2, 10, 40,50,60}; 
        int n = arr.length; 
        int x = 4; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if(result == -1) 
            System.out.println("Element is not present in array"); 
        else
            System.out.println("Element is present at index " + 
                                result); 
    } 
} */

public class GFG { 
	  
    // main method 
    public static void main(String[] args) 
    { 
  
        // create ArrayList list1 
        ArrayList<String> 
            list1 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list1.add("Hii"); 
        list1.add("Geeks"); 
        list1.add("for"); 
        list1.add("Geeks"); 
  
        // print list 1 
        System.out.println("List1: "
                           + list1); 
  
        // Create ArrayList list2 
        ArrayList<String> 
            list2 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list2.add("Hii"); 
        list2.add("Geeks"); 
        list2.add("Gaurav"); 
  
        // print list 2 
        System.out.println("List2: "
                           + list2); 
  
        // Find the common elements 
        list1.retainAll(list2); 
  
        // print list 1 
        System.out.println("Common elements: "
                           + list1); 
    } 
} 
  
