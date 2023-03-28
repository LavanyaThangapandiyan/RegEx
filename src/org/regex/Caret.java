package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Caret {

	
	public static void main(String[] args)
	{
	String str="Java is a Object-Oriented Programming Language";
	Pattern p=Pattern.compile("^Java");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group() + "starts at" + m.start() +"and it ends at" +m.end());
		
	}
	
	}
    
}
