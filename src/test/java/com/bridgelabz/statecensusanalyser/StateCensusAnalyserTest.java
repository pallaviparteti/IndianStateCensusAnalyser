package com.bridgelabz.statecensusanalyser;

import com.opencsv.exceptions.CsvException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateCensusAnalyserTest {
	@Test
	public void checkNumberOfRecordMatches() throws CsvException, IOException {
		StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
		int count = censusAnalyser.analyser();
		Assert.assertEquals(10,count);
	}
}