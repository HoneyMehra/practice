package demo;

public class overloading {

	public static void main(String[] args) {
		run('a');
		double z=10.11;
		String a="10";
		int y=(int)z;
		System.out.println("ssss"+y);
		int v=Integer.valueOf(a);
		System.out.println("eee"+v);
		
	}
 public static void run() {
	 System.out.println("hi");
 }
 public static void run(int a) {
	 System.out.println(a);
 }
 public static void run(double a) {
	 System.out.println(a);
 }
 
}
