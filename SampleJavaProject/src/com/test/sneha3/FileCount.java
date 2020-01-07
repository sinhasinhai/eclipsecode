package com.test.sneha3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* 
 * 2> Write a utility method to find the total files in a folder, if the folder path 
 * is passed to it. Create a sub-folder "test" and add a text file with some text values
 */
public class FileCount {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\test";
		//"C:\\Users\\prakat-L-035\\Documents\\LearningFileIo"
		fileCountInDirectory(filePath);
		createFileInDirectory(filePath);
	}

	
	private static void fileCountInDirectory(String filePath) {
		File f = new File(filePath);
		if (f.isDirectory()) {
			File[] listFiles = f.listFiles();
			for (File file : listFiles) {
				System.out.println(file.getName());
			}

		}
	}
	
	private static void createFileInDirectory(String dirPath) throws IOException {
		File file=new File(dirPath+"\\add");
		file.mkdir();
		FileWriter fileWriter = new FileWriter(dirPath+"\\add\\addFile.txt");
		BufferedWriter bw= new BufferedWriter(fileWriter);
		bw.write("gbyug");
		bw.flush();
		bw.close();
	}

}
