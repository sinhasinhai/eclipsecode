package com.example.text;

public class ParseText {

	public static void main(String[] args) {
		
		String downloadedFileName = "This portable document format file name string length will be more than hundred characters long for testing.pdf";
		System.out.println("B4 downloadedFileName len="+downloadedFileName.length());
		String[] upfileName = downloadedFileName.split("\\.");
        if(upfileName[0].length() > 94) {
            upfileName[0] = upfileName[0].substring(0, 94);
        }
        System.out.println("After downloadedFileName len: "+( upfileName[0]+"-fr-FR").length());
        downloadedFileName = upfileName[0] + "-fr-FR." + upfileName[1];
		/*
		String strResponse = "[attachment; filename=\"English Document.doc\"; filename*=utf-8''English%20Document.doc]";
		//System.out.println("Response: "+strResponse);
		String fileName = strResponse.substring(strResponse.indexOf("filename=\"")+10, strResponse.lastIndexOf("\""));
		System.out.println("Parsed File Name: "+fileName);
		*/
	}

}
