package com.bridgelabz.statecensusanalyser;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteCsvData {
	void writer() throws IOException {
		File file = new File("census.csv");
		FileWriter fileWriter = new FileWriter(file);
		CSVWriter csvWriter = new CSVWriter(fileWriter);

		String[] line1 = {"SrNo.", "State", "Population"};
		String[] line2 = {"1", "Maharashtra", "8400000"};
		String[] line3 = {"2", "MP", "5900000"};
		String[] line4 = {"3", "Chandigad", "350000"};
		String[] line5 = {"4", "UP", "200000"};
		String[] line6 = {"4", "Punjab", "200000"};
		String[] line7 = {"4", "Tamilnadu", "200000"};
		String[] line8 = {"4", "Goa", "200000"};
		String[] line9 = {"4", "Rajsthan", "200000"};
		String[] line10 = {"4", "Karnataka", "200000"};
		csvWriter.writeNext(line1);
		csvWriter.writeNext(line2);
		csvWriter.writeNext(line3);
		csvWriter.writeNext(line4);
		csvWriter.writeNext(line5);
		csvWriter.writeNext(line6);
		csvWriter.writeNext(line7);
		csvWriter.writeNext(line8);
		csvWriter.writeNext(line9);
		csvWriter.writeNext(line10);
		csvWriter.close();
		fileWriter.close();
	}

	public static void main(String[] args) throws IOException, CsvException {
		System.out.println("Welcome To Census Analyser Of Indian state");
		WriteCsvData csvData = new WriteCsvData();
		csvData.writer();

	}
}