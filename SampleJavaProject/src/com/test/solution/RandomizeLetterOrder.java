package com.test.solution;

/*
 * Write a program to randomize letter order in a word while keeping the first and the last letter in place.
 * EX: I/P: ENGINE O/P: ENNIGE, EIGNNE, EINNGE, EINNGE, ENIGNE, ENGINE, ENGNIE, ENINGE
 */
public class RandomizeLetterOrder {

	public static void main(String[] args) {
		
		String[] str = {null, "", "abc", "geek", "WORD", "cloud", "engine"};
		
		for(int i=0; i < str.length; i++) {
			if(str[i] != null) {
				str[i] = str[i].toUpperCase();
			}
			System.out.println("Original String: "+str[i]);
			scramble(str[i]);
		}
	}
	
	private static char firstLetter, lastLetter;
	private static StringBuilder sb = new StringBuilder();
	
	/*
	 * Utility method to scramble all letters except first and last letters of a word
	 */
	public static void scramble(String str) {
		if(str != null && str.trim().length() > 0) {
			
			// Convert your string into a simple char array:
			char[] ch = str.toUpperCase().toCharArray();
			if(ch.length > 2) {
				
				firstLetter = ch[0];
				lastLetter = ch[str.length()-1];
				
				StringBuilder s = new StringBuilder();
				for(int i=1; i < ch.length-1; i++) {
					s.append(ch[i]);
				}
				
				printDistinctPermutation(s.toString(),"");
				if(sb.length() > 0) {
					System.out.println("COMBINATIONS: \n"+sb.toString().substring(0, sb.length()-2)+"\n");
					sb.setLength(0);
				}
			}
			
		}
	}
	
	/*
	 * Utility method to generate all the distinct permutations of input string
	 * ref: https://www.geeksforgeeks.org/print-all-permutations-of-a-string-in-java/
	 */
    public static void printDistinctPermutation(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
        	sb.append(firstLetter+ans+lastLetter+", ");
            return; 
        } 
  
        // Make a boolean array of size '26' which stores false by default and make true  
        // at the position which alphabet is being used 
        boolean alpha[] = new boolean[26]; 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of string 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding the ith character 
            String ros = str.substring(0, i) + str.substring(i + 1); 
  
            // If the character has not been used then recursive call will take place.  
            // Otherwise, there will be no recursive call 
            if (alpha[ch - 'A'] == false) {
                printDistinctPermutation(ros, ans + ch);
            }
            alpha[ch - 'A'] = true; 
        } 
    } 
    
}
