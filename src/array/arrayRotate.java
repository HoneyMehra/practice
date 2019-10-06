package array;

public class arrayRotate {
	 static int a[] = {1,2,54,12,55,43};
	public static void main(String[] args) {	
		int d=2;
		System.out.println("before rotate:");
		arrayPrint(a);
		rotate(a,d);
		arrayPrint(a);
	}
	static void arrayPrint(int a[]) {
		for(int z:a) {
			System.out.print(z+" ");
		}
	}
	
	static void rotate(int a[], int d) {		
		for(int i=0;i<d;i++) {	
			int n=a.length;
			int temp = a[0];
			for(int j=0;j<n-1;j++) {
				a[j]=a[j+1];				
			}
			a[n-1]=temp;
			//System.out.println("new");
			//arrayPrint(a);
		}
	}
}
