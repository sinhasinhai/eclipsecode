package com.test.sumit3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ReadWriteCSV {
	public static void main(String[] args) {
		try {
			fileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		fileReader(); 
		
		
		
	}
	private static void fileReader() {
		FileReader fileReader = null;
		//check the file exception
		try {
			fileReader = new FileReader("D:\\test\\sumit\\test.csv");
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
	private static void fileWriter() throws IOException {
		FileWriter fileWriter = new FileWriter("D:\\test\\sumit\\test.csv");
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
