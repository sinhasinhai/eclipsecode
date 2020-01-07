package com.test.sumit3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFolderCreateFolder {
	 public static void main(String[] args) throws IOException {
		 fileCountInDirectory();
		 fileCountInDirectory("D:\\test");
		 }

	 	//reading the file in the given link
		 private static void fileCountInDirectory() {
			 File f = new File("D:\\test");
			 if (f.isDirectory()) {
				 File[] listFiles = f.listFiles();
				 for (File file : listFiles) {
					 System.out.println(file.getName());
					 }
		
			 }
		 }
		 
		 //createing sub folder inside the folder in the given league 
		 private static void fileCountInDirectory(String dirPath) throws IOException {
		 File file=new File(dirPath+"\\add");
		 file.mkdir();
		 FileWriter fileWriter = new FileWriter(dirPath+"\\add\\addFile.txt");
		 BufferedWriter bw= new BufferedWriter(fileWriter);
		 bw.write("cxdghasvdsvgasdvfdgfsdhvfhjsdgfjbhg");
		 bw.flush();
		 bw.close();
		 }

 }





