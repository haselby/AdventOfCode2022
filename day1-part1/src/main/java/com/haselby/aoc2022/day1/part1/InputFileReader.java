package com.haselby.aoc2022.day1.part1;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// Attribution https://www.geeksforgeeks.org/reading-csv-file-java-using-opencsv/
// Attribution: https://howtodoinjava.com/java/library/parse-read-write-csv-opencsv/

public class InputFileReader {

    public static void print(String filename) throws IOException {

        List<String[]> allData;
        allData = read(filename);

        // Print Data
        for (String[] row : allData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    public static List<String> readIntoListOfStrings(String filename) throws IOException {
        List<String[]> allData;
        List<String> oneDimensionListOfStrings = new ArrayList<>();

        allData = read(filename);

        // Grab only first column of data
        for (String[] row : allData) {
            oneDimensionListOfStrings.add(row[0]);
        }
        return oneDimensionListOfStrings;
    }

    public static List<Integer> readIntoListOfIntegers(String filename) throws IOException {
        List<String[]> allData;
        List<Integer> oneDimensionListOfIntegers = new ArrayList<>();

        allData = read(filename);

        // Grab only first column of data
        for (String[] row : allData) {
            // If string is empty, insert null
            if (row[0].isEmpty()) {
                oneDimensionListOfIntegers.add(null);
            } else {
                oneDimensionListOfIntegers.add(Integer.parseInt(row[0]));
            }
        }
        return oneDimensionListOfIntegers;
    }


    public static List<String[]> read(String filename) throws IOException {

        URL fileUrl = InputFileReader.class.getClassLoader().getResource(filename);
        var file = (fileUrl != null) ? fileUrl.getFile() : null;

        // Verify file is not null
        if (file == null) throw new IOException("File not found");

        FileReader fileReader;
        // Verify fileReader initialized successfully
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException fe) {
            throw new IOException("File not found");
        }

        List<String[]> allData;
        // Create csvReader object
        // Default separator is comma
        // Start reading from line number 0 (line numbers start from zero)
        CSVParser csvParser = new CSVParserBuilder()
                .withSeparator(',')
                .withIgnoreQuotations(true)
                .build();

        // CSVReaderBuilder supports try-with-resources by implementing AutoCloseable interface
        try (CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withSkipLines(0).
                withCSVParser(csvParser)
                .build()) {

            try {
                allData = csvReader.readAll();
            } catch (CsvException e) {
                throw new RuntimeException(e);
            }
        }

        fileReader.close();
        return allData;
    }
}
