package com.test.solution3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

/*
 * Create a CSV file with 3 columns ex: (numeric, text, comma separated value) <=> (101, "My Name", "Bangalore, Hyderabad, Pune").
 * Put the contents to a text file, with # as the delimiter. The o/p text file should display: #101#My Name#Bangalore, Hyderabad, Pune#
 * Note: use opencsv-4.6.jar & commons-lang3-3.9.jar
 * 
 * ref: https://www.geeksforgeeks.org/writing-a-csv-file-in-java-using-opencsv/#targetText=Writing%20a%20CSV%20file%20in,you%20are%20want%20to%20do.
 * ref: https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
 */
public class CreateCSVFile {

	public static void main(String[] args) {

		String filePath = "D:\\test\\CustomerDetails.csv";
		File file = new File(filePath);
		try {
			// Create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// Create CSVWriter object with filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			System.out.println("Creating CSV file.");

			// adding header to csv
			String[] header = { "Customer Id", "Customer Name", "Item Details" };
			writer.writeNext(header);

			// add data to csv
			String[] data1 = { "101", "Rakesh Sharma", "Screw Driver, Hammer, Nuts, Bolts, Plier" };
			writer.writeNext(data1);

			String[] data2 = { "102", "Smitha Patel", "Cosmetics, Brush, Hand Bag, Slippers, Mitten, Apron" };
			writer.writeNext(data2);

			// closing writer connection
			writer.close();
			outputfile.close();

			System.out.println("Created the CSV file with customer data.");

			System.out.println("Copying the CSV contents to Text file.");

			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = "\",\"";
			String[] custData;

			try {

				br = new BufferedReader(new FileReader(filePath));
				outputfile = new FileWriter(filePath.replace("csv", "txt"));
				while ((line = br.readLine()) != null) {

					// use comma as separator
					custData = line.split(cvsSplitBy);

					outputfile.write("#" + custData[0].replace("\"", "") + "#" + custData[1]  
							+ "#" + custData[2].replace("\"", "") + "#" + System.lineSeparator());
					
					outputfile.flush();
					
				}
				
				outputfile.close();
				System.out.println("Copied the CSV contents to Text file.");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
