package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class singleCharUsingRegex {

	public static void main(String...s) {
		/*String name="himanshu";
		Pattern pattern = Pattern.compile("hi*"); 
		Matcher m = pattern.matcher(name); 
        while (m.find()) 
            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1)); */
		
		
		
		/*String name="himanshu1mehra2great";
		String cutoff="\\d";
		Pattern p= Pattern.compile(cutoff);
		String s[]=p.split(name);
		for(String temp:s)
		{
			System.out.println(temp);
		}*/
		
		
		String name="himanshu";
		boolean a=Pattern.matches(".......u", name);
		System.out.println(a);
		
		boolean b3 = Pattern.matches(".s", "as");  
		System.out.println(b3);
	}
}
