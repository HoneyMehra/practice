package demo;

public class tryexample {

	public static void main(String[] args) {
		try {
			fun();
			}
			catch(Exception e){
			System.out.println("hello");
			}

			}
			public static void fun()
			{
			System.out.println("hiiiiiiiii");
			int a=0;
			int c=a/0;
			System.out.println(c);
			}

}