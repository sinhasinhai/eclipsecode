package com.test.solution;

/*
 * Write a utility method to find the frequency of times the pattern is found in the text string.
 * Ex: I/P: pattern: bcd text: aserwebcdasdbcdbcderbbcd O/P: Frequency: 4
 */
public class PatternFrequency {

	public static void main(String[] args) {
		
		String pattern = null, text = null;
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
		text = "Some Text";
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
		pattern = "Some Pattern";
		text = null;
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
		pattern = "";
		text = "";
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
		pattern = "sg@7";
		text = "sg@7";
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
		pattern = "More words";
		text = "";
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
		pattern = "bcd";
		text = "aserwebcdasdbcdbcderbbcd";
		System.out.println("Pattern: '"+pattern+"'\tText: '"+text+"'\tTotal Occurrence: " + getTotalOccurrence(pattern, text));
		
	}
	
	/* 
	 * Utility method to find the total occurrence of a pattern in a string
	 */
	public static int getTotalOccurrence(String pattern, String text) {
		
		int position = 0, count = 0;
		if(pattern != null && text != null) {
			
			pattern = pattern.trim();
			text = text.trim();
			
			if(pattern.length() > 0 && text.length() > 0 && pattern.length() <= text.length()) {
				while(text.indexOf(pattern, position) != -1) {
					count++;
					//System.out.println("Occurrence Count #"+count+"\tString found at position: "+text.indexOf(pattern, position));
					position = text.indexOf(pattern, position) + pattern.length();
				}
			}
		}
		return count;
	}

}
