package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
	public static void main(String[]args)
	{
		String sentence ="abcaabbccaaAaabbbcaabcd*/-+@#$%%^";
		Pattern p=Pattern.compile("[a+|a*|a?|a{3}]");
		Matcher m=p.matcher(sentence);
		
		while(m.find())
		{
			System.out.println(m.group());
			
		}
	}

		
}
