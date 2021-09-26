package otherProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstLetterOfWord {

	public static void main(String... args) {
		
		/*
		 * Input : Geeks for geeks Output :Gfg
		 * 
		 * Input : United Kingdom Output : UK
		 */
		
		
		String str = "Geek for Geeks";
		char[] ar = str.toCharArray();
		
		//Working
		for(int i=0; i<ar.length ; i++) {
			if(i==0) {
				System.out.print(ar[i]);
			}
			if(ar[i] == ' ') {
				System.out.print(ar[i+1]);
			}
		}
		
		System.out.println();
		//Sol 2 using Regex
		String str1 = "United 1ingdom Output";
		printFirstString(str1);
		
	}
	
	
	static void printFirstString(String s)
    {
		// /b is a boundary matcher - REGEX
        Pattern p = Pattern.compile("\\b[a-zA-Z0-9]");
        Matcher m = p.matcher(s);
        while (m.find()) {
        	System.out.print(m.group());
        }
    }
}
