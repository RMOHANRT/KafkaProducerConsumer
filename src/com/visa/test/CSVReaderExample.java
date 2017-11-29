/*package com.visa.test;



import java.io.FileReader;
import java.io.IOException;
public class CSVReaderExample {
	 public static void main(String[] args) {

	        String csvFile = "/Users/mkyong/csv/country3.csv";

	        CSVReader reader = null;
	        try {
	            reader = new CSVReader(new FileReader(csvFile));
	            String[] line;
	            while ((line = reader.readNext()) != null) {
	                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	    }

	}*/