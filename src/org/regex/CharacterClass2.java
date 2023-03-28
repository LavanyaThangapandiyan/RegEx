package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass2 {

	public static void main(String[]args)
	{
		String sentence ="abcaabbccaaaaabbbcccaabaacaaabc";
		Pattern p=Pattern.compile("[^ab]");
		Matcher m=p.matcher(sentence);
		
		while(m.find())
		{
			System.out.println(m.group());
			
		}
	}

}
