package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexBasics
{
	public static void main(String[] args)
	{
	String sentence= "Fear leadsto anger;anger leads to harted;harted leads to conflict;conflict leads to suffering";
	Pattern p=Pattern.compile("leads");
	Matcher m=p.matcher(sentence);
	while(m.find())
	{
		System.out.println(m.group() + "starts" + m.start() + "and ends at"+m.end());
		
	}
	
    }

}
