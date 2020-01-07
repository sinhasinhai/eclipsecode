package com.test.solution3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * Write a utility method to find the total files in a folder, if the folder path is passed to it. 
 * Create a sub-folder "test" and add a text file with some text values.
 * 
 * ref: https://www.geeksforgeeks.org/java-program-list-files-directory-nested-sub-directories-recursive-approach/
 */
public class CreateFolderFile {

	public static void main(String[] args) {

		try {
			// Provide full path for director
			String mainFolderPath = "D:\\";
			
			displaySubfoldersAndFiles(mainFolderPath);
			
			createNewFolderFile(mainFolderPath+"test\\sample.txt");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Method to create sub-folder and new text file with some contents
	 */
	public static void createNewFolderFile(String newFilePath) throws IOException {
		try {
			File file = new File(newFilePath);
			
			if (!file.exists()) {
				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdir();
					System.out.println("\nFolder created successfully.");
				}
			    file.createNewFile();
			    System.out.println("\nFile created successfully.");
			    
			    PrintWriter writer = new PrintWriter(file);
		        writer.print("Writing something...");
		        writer.close();
		        System.out.println("File contents added to the newly generated file.");
		        
			} else {
				System.out.println("The file is already present in the path: "+file.getAbsolutePath());
			    throw new IOException("Failed to create directory " + file.getParent());
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Method to display the total sub-folders and files with their names
	 */
	public static void displaySubfoldersAndFiles(String mainFolderPath) {

		// File object
		File mainDir = new File(mainFolderPath);

		if (mainDir.exists() && mainDir.isDirectory()) {

			// Array for files and sub-directories of directory pointed by mainDir
			File arr[] = mainDir.listFiles();
			List<String> fileNames = new ArrayList<>();
			List<String> subFolders = new ArrayList<>();
			
			for(int i=0; i < arr.length; i++) {
				if(arr[i].isDirectory()) {
					subFolders.add(arr[i].getName());
				}
				else if(arr[i].isFile()) {
					fileNames.add(arr[i].getName());
				}
			}
			
			System.out.println("\nTotal files: "+fileNames.size()+"\nList of files:");
			for(int j=0; j < fileNames.size(); j++) {
				System.out.println("("+(j+1)+") "+fileNames.get(j));
			}
			
			System.out.println("\nTotal sub-folders: "+subFolders.size()+"\nList of sub-folders:");
			for(int k=0; k < subFolders.size(); k++) {
				System.out.println("["+(k+1)+"] "+subFolders.get(k));
			}
		}
		else {
			System.out.println("Please specify a valid folder path");
		}
	}

}
