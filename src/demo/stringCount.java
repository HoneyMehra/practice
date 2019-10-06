package demo;

public class stringCount {

	/*public static void main(String[] args) {
		String s="aaabbcdd";
		StringBuilder s1 = new StringBuilder();
		int count=1;
		for(int i=0,j=i+1;i<=s.length() || j<s.length();i++,j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
			else {
				if(count==1) {
					s1.append(s.charAt(i)+"");
					count=1;
				}
				else {
					s1.append(s.charAt(i)+""+count);
					count=1;
				//}
			}
		}
		System.out.println("string is"+s1);
	}*/
	
/*	public static String compress(String text) {
	    String result = "";

	    int index = 0;

	    while (index < text.length()) {
	        char c = text.charAt(index);
	        int count = count(text, index);
	        if (count == 1)
	            result += "" + c;
	        else
	            result += "" + count + c;
	        index += count;
	    }

	    return result;
	}

	public static int count(String text, int index) {
	    char c = text.charAt(index);
	    int i = 1;
	    while (index + i < text.length() && text.charAt(index + i) == c)
	        i++;
	    return i;
	}

	public static void main(String[] args) {
	    String test = "AAABBCCC";
	    System.out.println(compress(test));
	}
*/
	public static void main(String[] args)
	{
	    System.out.println(compress("AAABBBBCC"));
	    System.out.println(compress("AAABC"));
	    System.out.println(compress("A"));
	    System.out.println(compress("ABBDCC"));
	    System.out.println(compress("AZXYC"));
	}

	static String compress(String str)
	{
	    StringBuilder stringBuilder = new StringBuilder();
	    char[] charArray = str.toCharArray();
	    int count = 1;
	    char lastChar = 0;
	    char nextChar = 0;
	    lastChar = charArray[0];
	    for (int i = 1; i < charArray.length; i++)
	    {
	        nextChar = charArray[i];
	        if (lastChar == nextChar)
	        {
	            count++;
	        }
	        else
	        {
	            stringBuilder.append(count).append(lastChar);
	            count = 1;
	            lastChar = nextChar;

	        }
	    }
	    stringBuilder.append(count).append(lastChar);
	    String compressed = stringBuilder.toString();

	    return compressed;
	} 
}
