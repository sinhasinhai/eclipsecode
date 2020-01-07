package com.howtodoinjava.csv.demoScanner;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Reader 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //Get scanner instance
        Scanner scanner = new Scanner(new File("/home/sneha-prakat/eclipse/csv.xlsx"));
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");
         
        //Get all tokens and store them in some data structure
        //I am just printing them
        while (scanner.hasNext()) 
        {
            System.out.print(scanner.next() + "|");
        }
         
        //Do not forget to close the scanner  
        scanner.close();
    }
}