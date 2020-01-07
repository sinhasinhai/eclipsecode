package com.test.sneha3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

/*
 * 4> Create a CSV file with 3 columns ex: (numeric, text, comma separated value) 
 * <=> (101, "My Name", "Bangalore, Hyderabad, Pune"). Put the contents to a 
 * text file, with # as the delimiter. The o/p text file should display: 
 * #101#My Name#Bangalore, Hyderabad, Pune#
 * Note: use opencsv-4.5.jar & commons-lang3-3.9.jar
 */
public class CSVWriting {
	
	public static void main(String[] args) {
		String filePath = "D:\\test\\sneha\\temp.csv";
		//"C:\\Users\\prakat-L-035\\Documents\\LearningFileIo\\tempcsv.csv"
		try {
			fileWriter(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader fileReader = null;
		//check the file exception
		try {
			fileReader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		//create the csv file reader
		CSVReader csvReader = new CSVReader(fileReader);
		String[] nextRecord;
		 try {
			while ((nextRecord = csvReader.readNext()) != null) { 
			        for (String cell : nextRecord) { 
			            System.out.print(cell + "\t"); 
			        } 
			        System.out.println(); 
			    }
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
    //In this private class we write the content
	private static void fileWriter(String filePath) throws IOException {
		FileWriter fileWriter = new FileWriter(filePath);
		CSVWriter csvWriter = new CSVWriter(fileWriter);
        //taking the value in csv as header and the line1
		String[] header = { "Name", "Class", "Marks" }; 
		csvWriter.writeNext(header);
		String[] line1 = { "Name", "Class", "Marks" }; 
		csvWriter.writeNext(line1);
		//close the writer file
		csvWriter.close();
	}

}
