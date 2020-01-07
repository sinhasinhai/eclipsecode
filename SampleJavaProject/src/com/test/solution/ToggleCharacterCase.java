package com.test.solution;

/*
 * Utility method to toggle each character of the input text.
 * Ex: I/P: asastTRdcsdSER O/P: ASASTtrDCSDser
 */
public class ToggleCharacterCase {

	public static void main(String[] args) {

		String str = null;
		System.out.println("Original String: "+str+"\tToggle Characters Case: "+toggleCase(str));
		
		str="";
		System.out.println("Original String: "+str+"\tToggle Characters Case: "+toggleCase(str));
		
		str = "asastTRdcsdSER";
		System.out.println("Original String: "+str+"\tToggle Characters Case: "+toggleCase(str));
		
		str = "sOME sTrINg @ 123";
		System.out.println("Original String: "+str+"\tToggle Characters Case: "+toggleCase(str));
	}

	private static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder();
		if(str != null && str.trim().length() > 0) {
			char[] ch = str.trim().toCharArray();
			
			for(int i=0; i < ch.length; i++) {
				
				if(Character.isLowerCase(ch[i])) {
					sb.append(Character.toUpperCase(ch[i]));
				}
				else {
					sb.append(Character.toLowerCase(ch[i]));
				}
			}
		}
		return sb.toString();
	}

}
