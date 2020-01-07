package com.test.sumit3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Read xls file and write its contents to another file.
 */

public class ReadWriteXlsFile {

	public static void main(String[] args) {
		try
		{
			checkingFile();
		}
		//catch the exception of the file
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

	private static void checkingFile() throws FileNotFoundException, IOException {
		//check the condition whether it's there or not
		boolean create=true;
		//take the source folder name
		Scanner KB=new Scanner(System.in);

		System.out.print("Enter Source File Name:");
		String sfilename=KB.next();
		File srcfile=new File(sfilename);
		//check the exesistence of the folder whether it's present or not
		if(!srcfile.exists())
		{
			System.out.println("File Not Found..");
		}			
		else
		{
			createNewFile(create, KB, sfilename);
		}
	}

	private static void createNewFile(boolean create, Scanner KB, String sfilename)
			throws FileNotFoundException, IOException {
		//create the new file
		FileInputStream FI=new FileInputStream(sfilename);
		System.out.print("Enter Target File Name:");
		String tfilename=KB.next();
		File tfile=new File(tfilename);
		if(tfile.exists())
		{  
			System.out.print("File Already Exist OverWrite it..Yes/No?:");
			String confirm=KB.next();
			if(confirm.equalsIgnoreCase("yes"))
			{ 
				create=true;
			}
			else 
			{
				create=false;  
			} 
		}  
		if(create)
		{
			FileOutputStream FO=new FileOutputStream(tfilename);
			int b;
			//read content and write in another file
			while((b=FI.read())!=-1)
			{ 
				FO.write(b);
			}
			System.out.println("\nFile Copied...");
		}
		FI.close();
	}
}
