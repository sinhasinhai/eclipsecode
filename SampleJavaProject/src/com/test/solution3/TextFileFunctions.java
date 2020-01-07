package com.test.solution3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * Read a text file and copy its contents to a new file.
 * Append additional contents at the end of the new file created.
 * 
 * ref: http://java.candidjava.com/tutorial/Copying-content-from-one-file-to-another-using-java.htm
 * ref: https://www.programiz.com/java-programming/examples/append-text-existing-file
 */
public class TextFileFunctions {

	public static void main(String[] args) {
		try {
			
			String s, path = "D:\\test\\sample.txt";
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			path = path.replace("sample", "output");
			FileWriter fw = new FileWriter(path, true);

			// Read line by line from original file
			while ((s = br.readLine()) != null) {
				fw.write(s); // Write to output file
				fw.flush();
			}
			br.close();
			fw.close();
			System.out.println("File contents copied to new file.");
			
			System.out.println("\nAppending the copied file with additional text.");
			
			// First way to append text to a file
			fw = new FileWriter(path, true);
			fw.write("First string to be added.");
			fw.close();
			
			// Second way to append text to a file
			Files.write(Paths.get(path), "Second string to be added.".getBytes(), StandardOpenOption.APPEND);
			
			System.out.println("Additional text added to the file.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
