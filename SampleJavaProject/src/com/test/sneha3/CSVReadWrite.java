package com.test.sneha3;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CSVReadWrite {

	public static void main(String[] args) throws IOException {
		//path at which the value is stored
		FileWriter fileWriter = new FileWriter("C:\\Users\\prakat-L-035\\Documents\\LearningFileIo\\tempcsv.csv");
		CSVWriter csvWriter = new CSVWriter(fileWriter, '#', CSVWriter.NO_QUOTE_CHARACTER,
				CSVWriter.DEFAULT_ESCAPE_CHARACTER, "#");
		String[] data = { "100", "My Name", "Bangalore, Hyderabad, Pune" };
		csvWriter.writeNext(data);

		// closing writer connection
		csvWriter.close();
	}
}
