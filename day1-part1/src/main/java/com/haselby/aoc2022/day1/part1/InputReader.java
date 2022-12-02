package com.haselby.aoc2022.day1.part1;

import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.util.List;

// Attribution https://www.geeksforgeeks.org/reading-csv-file-java-using-opencsv/
public class InputReader {

    // Java code to illustrate reading all data at once
    public static void readAllDataAtOnce(String file) {
        try {
            // Create an object of file reader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object and skip first Line
            com.opencsv.CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();

            List<String[]> allData = csvReader.readAll();

            // print Data
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
