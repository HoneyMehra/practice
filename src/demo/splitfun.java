package demo;

import java.util.regex.Pattern;

public class splitfun {

	public static void main(String[] args) {
		String s = "himanshu||mehra";
		//String sa[]= s.split("\\|\\|",15);
		//System.out.println(sa[0]);
		String sa[]=s.split(Pattern.quote("||"));
		System.out.println(sa[0]);
	}

}
