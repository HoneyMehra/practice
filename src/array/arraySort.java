package array;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arraySort {
	public static void main( String[] args ) {
	    List<String> theStrings = Arrays.asList( new String[] {
	            "3.Animal",
	            "1.Box",
	            "4.Monkey",
	            "2.Tiger",
	            "11.Panzerkampfwagen",
	            null,
	            null,
	            "127.0.0.1" } );
	    Collections.sort( theStrings, new Comparator<String>() {
	        Pattern pattern = Pattern.compile( "(\\d+).*" );

	        @Override
	        public int compare( String s1, String s2 ) {
	            if ( s1 == null && s2 == null ) {
	                return 0;
	            } else if ( s1 != null && s2 == null ) {
	                return -1;
	            } else if ( s1 == null && s2 != null ) {
	                return 1;
	            } else {
	                Matcher s1Matcher = pattern.matcher( s1 );
	                Matcher s2Matcher = pattern.matcher( s2 );
	                if ( !s1Matcher.matches() && !s2Matcher.matches() ) {
	                    return s1.compareTo( s2 );
	                } else if ( s1Matcher.matches() && !s2Matcher.matches() ) {
	                    return -1;
	                } else if ( !s1Matcher.matches() && s2Matcher.matches() ) {
	                    return 1;
	                } else {
	                    int i1 = Integer.parseInt( s1Matcher.group( 1 ) );
	                    int i2 = Integer.parseInt( s2Matcher.group( 1 ) );
	                    return i1 - i2;
	                }
	            }
	        }

	    } );
	    System.out.println( theStrings );
	}
}
