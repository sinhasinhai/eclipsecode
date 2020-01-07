package com.test.solution2;

import java.util.HashMap;

/*
 * Given a string, find out largest substring such that all its characters are consecutive.
 * Ex: I/P: abtierzabc O/P: abc
 * I/P: abcedabcde O/P: abcde
 */
public class LargestConsecutiveSubstring {

	public static void main(String[] args) {
		
		String[] str = {null, "", "abtierzabc", "abcedabcde", "abcabcdefabc"};
		String larStr = null;
		
		for(int i=0; i < str.length;i++) {
			
			System.out.println("\nOriginal String: \""+str[i]+"\"");
			if(str[i] == null) {
				larStr = null;
			}
			else {
				larStr = largestSubStr(str[i], str[i].length());
			}
			
			if(larStr != null) {
				System.out.print("Largest Substring: \""+larStr+"\"\tString Length: "+larStr.length()+"\n");
			}
		}

	}

	/*
	 * Function to return the longest sub-string of consecutive characters from str
	 */
	static String largestSubStr(String str, int strLen) {
		int len = 0, i = 0;
		String consecutiveSubstring = null;
		HashMap<Integer, String> hm = new HashMap<>();
		
		while (i < strLen) {
			// Valid sub-string exists from index i to end
			int end = getEndingIndex(str, strLen, i);
			
			consecutiveSubstring = str.substring(i, end+1);
			hm.put(consecutiveSubstring.length(), consecutiveSubstring);
			System.out.println("Consecutive Substring: "+consecutiveSubstring);

			// Update the length
			len = Math.max(end - i + 1, len);
			i = end + 1;
		}
		return hm.get(Integer.parseInt(""+len));
	}

	/*
	 * Function to return the ending index for the largest valid sub-string starting from index i
	 */
	static int getEndingIndex(String str, int strLen, int i) {
		i++;
		while (i < strLen) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

			// If the current character appears after the previous character according to the given circular alphabetical order
			if ((curr == 'a' && prev == 'z') || (curr - prev == 1)) {
				i++;
			}
			else {
				break;
			}
		}

		return i - 1;
	}

}
