package array;

public class BInaySearchElement {
	static int a[]= {1,3,12,43,49,51,89,90,91};
	static int result=-1;
	public static void main(String[] args) {		
		int b=91;
		int n=a.length-1;
		int result = binarySearch(0,b,n);
		System.out.println("element found at index :"+result);
	}

	static int binarySearch(int z,int b,int n) {
		int mid= (z+n)/2;
		for(;;) {
		if(b>a[n] || b<a[z]) {
			System.out.println("element is not in list");
			break;
		}	
		if(a[mid]==b) {
			result=mid;
			break;
		}
		 if(a[mid]>b && result==-1) {
			if(a[mid-1]==b) {
				result=mid-1;
				break;
			}
			else {
				binarySearch(z,b, mid-1);
			}
		}
		 if(a[mid]<b && result==-1){
			if(a[mid+1]==b) {
				result=mid+1;
				break;
			}
			else {
				binarySearch(mid+1, b, n);
			}
		}
		 else
			 break;
		}
		return result;
	} 
}
