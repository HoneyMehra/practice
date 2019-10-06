package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class readFromNotepad {
	static char c = 0;
	static String s1 = null;
	public static void main(String[] args) throws Exception {
		File file= new File("//home//HIMANSHU.MEHRA//Desktop//test.txt");
		FileReader reader = new FileReader(file);
		int i;
		String s[];
		LinkedList<String> s2=new LinkedList<String>();
		while((i=reader.read())!=-1)
		{
			c = (char)i;
			 s1=String.valueOf(c);
			 s2.add(s1);
		}
		System.out.println("list character"+s2);
		String str= s2.toString();
		System.out.println("string is"+str);
		String str1=str.substring(1, str.length()-1).replaceAll(", ", "");
		System.out.println("string after"+str1);
		Map<String, String> map=new HashMap<String, String>();
		s=str1.split(":|\n");
		for(int j=0;j<s.length-1;j++)
		{
		
		System.out.println("string length"+s.length);
		System.out.println("first1"+s[0]);	
		System.out.println("first2"+s[1]);
		System.out.println("first3"+s[2]);
		System.out.println("first4"+s[3]);
		map.put(s[j], s[j+1]);
		j++;
		}
		System.out.println("map is"+map);
		String pass=map.get("password");
		System.out.println("password is"+pass);
	}
}
