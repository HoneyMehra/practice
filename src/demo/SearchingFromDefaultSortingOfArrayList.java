package demo;

import java.util.ArrayList;
import java.util.Collections;
 
/*public class SearchingFromDefaultSortingOfArrayList {
 
    public static void main(String[] args) {
 
        // creating ArrayList object of type String
        ArrayList<String> al = new ArrayList<String>();
 
        // adding elements to ArrayList object
        al.add("Narayan Murthy");
        al.add("Dinesh");  
        al.add("Nandan Nilekeni");  
        al.add("Ashok Arora");
        al.add("Shibulal");
        al.add("Kris Gopalakrishnan");
        al.add("Raghavan");
 
        System.out.println("Before Sorting:"
                + " Iterating ArrayList values\n");
 
        // Iterating using enhanced for-loop
        for(String str : al){
            System.out.println(str);
        }
 
        // sorting using Collections.sort(al);
        Collections.sort(al);
 
        System.out.println("\n\nAfter Sorting:"
                + " Iterating ArrayList values\n");
 
        // Iterating using enhanced for-loop
        for(String str : al){
            System.out.println(str);
        }
 
        // searching element from default natural ordering
        // of String type
        int iStringSearch = Collections
                .binarySearch(al, "Kris Gopalakrishnan");
        System.out.println("\n\nElement found at index position "
                + iStringSearch 
                + " from Sorted ArrayList");
    }
}*/


 class Customer implements Comparable<Customer> {
	 
    // member variables
    int customerId;
    String customerName;
 
    // 2-arg parameterized constructor
    public Customer(int customerId, String customerName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
    }
 
    // override toString() method
    @Override
    public String toString() {
        return "Customer ["
                + "customerId=" + customerId
                + ", customerName=" + customerName 
                + "]";
    }
 
    // override compareTo() method
    @Override
    public int compareTo(Customer o) {
        return this.customerName.compareTo(o.customerName);
    }}

public class SearchingFromDefaultSortingOfArrayList {
	 
    public static void main(String[] args) {
 
        // creating ArrayList object of type Customer
        ArrayList<Customer> al = new ArrayList<Customer>();
 
        // adding elements to ArrayList object
        al.add(new Customer(101, "Narayan Murthy"));
        al.add(new Customer(107, "Dinesh"));
        al.add(new Customer(103, "Nandan Nilekeni"));
        al.add(new Customer(102, "Ashok Arora"));
        al.add(new Customer(104, "Shibulal"));
        al.add(new Customer(106, "Kris Gopalakrishnan"));
        al.add(new Customer(105, "Raghavan"));
 
        System.out.println("Before Sorting:"
                + " Insertion Order\n");
 
        // insertion order
        for(Customer cust : al){
            System.out.println(cust.customerId 
                    + "  "
                    + cust.customerName);
        }
 
        // sorting using Collections.sort(al);
        Collections.sort(al);
 
        System.out.println("\n\nAfter Sorting:"
                + " Natural ordering of Customer Name\n");
 
        // natural ordering of customer name using Comparable
        for(Customer cust : al){
            System.out.println(cust.customerId 
                    + "  "
                    + cust.customerName);
        }
 
        // customer to be searched
        Customer searchCustomer = new Customer(105, "Raghavan");
 
        // searching element from default natural ordering 
        // of String type
        int iStringSearch = Collections
                .binarySearch(al, searchCustomer);
        System.out.println("\n\nCustomer found at index position "
                + iStringSearch 
                + " from Sorted ArrayList");
    }
}
