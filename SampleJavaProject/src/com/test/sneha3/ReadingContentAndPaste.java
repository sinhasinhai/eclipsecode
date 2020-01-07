package com.test.sneha3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 3> Read a text file and copy its contents to a new file. 
 * Append additional contents at the end of the new file created.
 */
public class ReadingContentAndPaste {
	//store the value for both new and the old file
	static String newFileName = "C:\\Users\\prakat-L-035\\Documents\\LearningFileIo\\temp1.txt";
	static String oldFileName = "C:\\Users\\prakat-L-035\\Documents\\LearningFileIo\\temp.txt";

	public static void main(String[] args) throws IOException {
		
		newFileName = "D:\\test\\sneha\\copy.txt";
		oldFileName = "D:\\test\\sneha\\myText.txt";
		FileReader reader = new FileReader(oldFileName);
		BufferedReader br = new BufferedReader(reader);
		String st;
		FileWriter writer = new FileWriter(newFileName);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("my new File created");
		bw.write(" Append additional contents at the end of the new file created");
		while ((st = br.readLine()) != null) {
			bw.write(st);
			bw.newLine();
		}
		bw.flush();
		reader.close();
		writer.close();
		br.close();
		bw.close();
	}

}
