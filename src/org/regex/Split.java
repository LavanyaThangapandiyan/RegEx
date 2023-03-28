package org.regex;

public class Split {

	public static void main(String[]args)
	{
		String sentence2="www.google.com";
		String[]st=sentence2.split("\\.");
		for(String s: st)
			System.out.println(s);
	}

}
