package com.test.sneha2;

public class Sequence {
//main function
	public static void main(String[] args) {
//value which need to be search
		//findSequence("abtierzabc");
		
		String[] str = {null, "", "abtierzabc", "abcedabcde", "abcabcdefabc"};
		String larStr = null;
		
		for(int i=0; i < str.length;i++) {
			
			System.out.println("\nOriginal String: \""+str[i]+"\"");
			if(str[i] == null) {
				larStr = null;
			}
			else {
				findSequence(str[i]);
			}
			
			if(larStr != null) {
				System.out.print("Largest Substring: \""+larStr+"\"\tString Length: "+larStr.length()+"\n");
			}
		}
	}

//find sequence 
	public static void findSequence(String valueToBeParsed) {
		int lengthOFString = valueToBeParsed.length();
		int startIndex = 1;
		int startingPoint = 0;
		String lastString = null;
		int lastStringLength = 0;
//compaire the starting index value which is greater then the length of the string 
		while (startIndex < lengthOFString) {
			int diff = valueToBeParsed.charAt(startIndex) - valueToBeParsed.charAt(startIndex - 1);
//check the condition with the starting index with the total length of the string
			if (diff != 1 || startIndex == lengthOFString - 1) {
				if (startIndex == lengthOFString - 1) {
					startIndex++;
				}
				if (lastStringLength < valueToBeParsed.substring(startingPoint, startIndex).length()) {
					lastString = valueToBeParsed.substring(startingPoint, startIndex);
				}
				lastStringLength = lastString.length();
				startingPoint = startIndex;
			}
			startIndex++;

		}
//print the last value which start from the "a"
		System.out.println(lastString);
	}

}
