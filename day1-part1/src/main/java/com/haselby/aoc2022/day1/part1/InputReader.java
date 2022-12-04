package com.haselby.aoc2022.day1.part1;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

/*
 import com.opencsv.exceptions.CsvValidationException;
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.util.Arrays;
*/

// Attribution https://www.geeksforgeeks.org/reading-csv-file-java-using-opencsv/
// Attribution: https://howtodoinjava.com/java/library/parse-read-write-csv-opencsv/
public class InputReader {

    // Java code to illustrate reading all data at once
    public static void readAllDataAtOnce(String file) {
        try {

            // Create an object of file reader capable of reading file from /scr/main/resources/
            URL fileUrl = InputReader.class.getClassLoader().getResource(file);
            FileReader filereader = new FileReader(fileUrl.getFile());

            // Create csvReader object
            // Default separator is comma
            // Start reading from line number 0 (line numbers start from zero)
            CSVParser csvParser = new CSVParserBuilder()
                    .withSeparator(',')
                    .withIgnoreQuotations(true)
                    .build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(0)
                    .withCSVParser(csvParser)
                    .build();

            List<String[]> allData = csvReader.readAll();

            // Print Data
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
