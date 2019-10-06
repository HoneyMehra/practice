package array;

public class reverseArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		run(a);
	} 
	public static void run(int a[]) {
		int n = a.length;
		int temp;
		for(int i=0;i<n/2	;i++)
		{
		temp = a[i];
		a[i] = a[n-1-i];
		a[n-1-i]=temp;
		}
		
		
		for(int k=0;k<a.length;k++)
		{
		System.out.println(a[k]);	
		}	
		}
}
