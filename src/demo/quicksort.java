package demo;

public class quicksort {
	static int a[]= {6,5,8,3,10,15,12,16};
	public static void main(String[] args) {
		
		int l=0,h=a.length-1;
		qsort(l,h);
	}
	
	public static int quick(int l, int h) {
		int pivot =a[l];
		int i,j=0;
		for( i=1,j=h;i<h && j<1;i++,j--) {
			if(i<j) {
				if(a[i]>pivot && a[j]<pivot) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			else {
				int temp=a[l];
				a[l]=a[j];
				a[j]=temp;
						
			}
		}
		return j;
	}
	
	public static void qsort(int l,int h) {
		int j = quick(l,h);
		quick(l,j-1);
		quick(j+1,h);
	}
}
