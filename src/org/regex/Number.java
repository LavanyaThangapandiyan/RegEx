package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

	public static void main(String[]args)
	{
		String sentence ="abcaabbccaaAaabbbcabC3255612150*/-+@#$%%^";
		Pattern p=Pattern.compile("[0-9]");
		Matcher m=p.matcher(sentence);
		
		while(m.find())
		{
			System.out.println(m.group());
			
		}
	}
		

}
