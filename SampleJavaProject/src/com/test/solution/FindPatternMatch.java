package com.test.solution;

/*
 * Write a utility method that takes 2 params for finding pattern match. The first param is the pattern to be searched from the second text param and return true if found.
 * Solution:
 * (1) Write a core java program, where the main method calls the static utility method isPatternFound(patternText, originalText)
 * (2) Call the isPatternFound() many times with different param combinations
 * <a> pattern: $a text: rg#$afgw$r*12 O/P: true
 * <b> pattern: encyclopedia@123 text: encyclopedia@123 O/P: true
 * <c> pattern: kcu3gt89whern98 text: n9 O/P: false
 */
public class FindPatternMatch {

	public static void main(String[] args) {

		String pattern, text;
		pattern = "$a";
		text = "rg#$afgw$r*12";
		
		if(doesPatternMatch(pattern, text)) {
			System.out.println("'"+pattern+"' is found in string '"+text+"'");
		}
		else {
			System.out.println("'"+pattern+"' is NOT found in string '"+text+"'");
		}
		
		pattern = "encyclopedia@123";
		text = "encyclopedia@123";
		if(doesPatternMatch(pattern, text)) {
			System.out.println("'"+pattern+"' is found in string '"+text+"'");
		}
		else {
			System.out.println("'"+pattern+"' is NOT found in string '"+text+"'");
		}
		
		pattern = "kcu3gt89whern98";
		text = "n9";
		if(doesPatternMatch(pattern, text)) {
			System.out.println("'"+pattern+"' is found in string '"+text+"'");
		}
		else {
			System.out.println("'"+pattern+"' is NOT found in string '"+text+"'");
		}
		
		pattern = null;
		text = "some string";
		if(doesPatternMatch(pattern, text)) {
			System.out.println("'"+pattern+"' is found in string '"+text+"'");
		}
		else {
			System.out.println("'"+pattern+"' is NOT found in string '"+text+"'");
		}
		
		pattern = "";
		text = "any string";
		if(doesPatternMatch(pattern, text)) {
			System.out.println("'"+pattern+"' is found in string '"+text+"'");
		}
		else {
			System.out.println("'"+pattern+"' is NOT found in string '"+text+"'");
		}
		
		pattern = null;
		text = null;
		if(doesPatternMatch(pattern, text)) {
			System.out.println("'"+pattern+"' is found in string '"+text+"'");
		}
		else {
			System.out.println("'"+pattern+"' is NOT found in string '"+text+"'");
		}
	}
	
	/*
	 * Utility method to check if the pattern is present in the text string
	 * #1# Using String.contains()
	 */
	public static boolean doesPatternMatch(String pattern, String text) {
		
		if(pattern != null && text != null) {
			
			pattern = pattern.trim();
			text = text.trim();
			
			if(pattern.length() > 0 && text.length() > 0) {
				if(text.contains(pattern)) {
					return true;
				}
			}
		}
		return false;
	}
	
	/*
	 * Utility method to check if the pattern is present in the text string
	 * #2# Using String.indexOf()
	 */
	public static boolean doesPatternMatch2(String pattern, String text) {
		
		if(pattern != null && text != null) {
			
			pattern = pattern.trim();
			text = text.trim();
			
			if(pattern.length() > 0 && text.length() > 0) {
				if(text.indexOf(pattern) >= 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	/*
	 * Utility method to check if the pattern is present in the text string
	 * #3# Using String.toCharArray()
	 */
	public static boolean doesPatternMatch3(String pattern, String text) {
		
		if(pattern != null && text != null) {
			
			pattern = pattern.trim();
			text = text.trim();
			
			if(pattern.length() > 0 && text.length() > 0 && pattern.length() <= text.length()) {
				
				char[] ch = pattern.toCharArray();
				char[] str = text.toCharArray();
				
				for(int i=0; i <= (str.length - ch.length); i++) {
					
					for(int j=0; j < ch.length; j++) {
						if(str[i+j] == ch[j]) {
							if(j+1 == ch.length) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

}
