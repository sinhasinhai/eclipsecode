package com.test.solution3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Read xlsx file and write its contents to another file.
 * Note: poi-3.9.0.jar
 * 
 * ref: https://howtodoinjava.com/library/readingwriting-excel-files-in-java-poi-tutorial/
 * ref: https://javarevisited.blogspot.com/2015/06/how-to-read-write-excel-file-java-poi-example.html
 */
public class CopyExcelFileContents {

	public static void main(String[] args) {

		String filePath = "D:\\test\\Employee_Data.xlsx";
		generateEmployeeWorkBook(filePath);
		duplicateEmployeeWorkBook(filePath);
	}

	/*
	 * Method to read the contents of Employee_Data.xlsx and display its contents
	 * Also create Duplicate_Employee_Data.xlsx
	 */
	private static void duplicateEmployeeWorkBook(String filePath) {

		System.out.println("Reading contents from excel file: " + filePath.substring(filePath.lastIndexOf("\\") + 1));
		try {
			FileInputStream file = new FileInputStream(new File(filePath));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// FYI - directly jump to line # to save as a different file
			// To display contents of excel file continue
			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					}
				}
				System.out.println("");
			}
			file.close();
			filePath = filePath.replace("Employee_Data.xlsx","Duplicate_Employee_Data.xlsx");
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File(filePath));
			workbook.write(out);
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Duplicated the excel file to new file: " + filePath.substring(filePath.lastIndexOf("\\") + 1));
	}

	/*
	 * Method to create a new excel file with employee data
	 */
	private static void generateEmployeeWorkBook(String filePath) {

		// Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Employee Data");

		// This data needs to be written (Object[])
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "ID", "NAME", "LASTNAME" });
		data.put("2", new Object[] { 1, "Amit", "Shukla" });
		data.put("3", new Object[] { 2, "Lokesh", "Gupta" });
		data.put("4", new Object[] { 3, "John", "Adwards" });
		data.put("5", new Object[] { 4, "Brian", "Schultz" });

		// Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}
		try {
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File("D:\\test\\Employee_Data.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("Employee_Data.xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
