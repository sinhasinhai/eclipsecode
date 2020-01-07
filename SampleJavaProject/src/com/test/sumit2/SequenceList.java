package com.test.sumit2;

//Java implementation of the approach 
public class SequenceList {

//Function to return the ending index for the
//largest valid sub-string starting from index i
	static int getEndingIndex(String str, int n, int i) {
		i++;
		while (i < n) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

//If the current character appears after
//the previous character according to
//the given circular alphabetical order
			if ((curr - prev == 1))
				i++;
			else
				break;
		}

		return i - 1;
	}

//Function to return the length of the longest
//sub-string of consecutive characters from str
	static String largestSubStr(String str, int n) {
		int len = 0;
		String subString = null;
		int startIndex = 0;
		while (startIndex < n) {

//Valid sub-string exists from index
//i to end
			int end = getEndingIndex(str, n, startIndex);
			if (len < Math.max(end - startIndex + 1, len)) {
				subString = str.substring(startIndex, end + 1);
			}
//Update the length
			startIndex = end + 1;
		}

		return subString;
	}

//Driver code
	public static void main(String args[]) {
		/*String str = "abtierzabc";
		int n = str.length();

		System.out.print(largestSubStr(str, n));*/
		
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
}