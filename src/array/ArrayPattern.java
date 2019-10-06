package array;

public class ArrayPattern {
	
	
public static void main(String[] args) {
int a[] = {0,1,1,0,1,0,1,0,1,1,0,0,0,1,0};
int b[] = {0,1,1};
pattern(a,b);
}

public static void pattern(int a[],int b[]) {
	int asize=a.length;
	int bsize=b.length, x=0,count = 0;
	for(int i=0;i<asize;i++) {
		x=x+1;
		System.out.println(b[x]);
		if(x<bsize && a[i]==b[x]) {
			if(bsize-1==x) {
				x=0;
				count++;
				System.out.println("pattern is"+(i-bsize+1));
			}
			continue;
		}
		else {
			x=0;
		}
}
	System.out.println("count :"+count);
	
}
}