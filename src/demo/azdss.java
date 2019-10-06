package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class azdss {
	public static void main(String[] args) {
		String s="1.himanshu2.mehra";
		Pattern p = Pattern.compile("(\\D+).*");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group(0));
		}
	}

}
