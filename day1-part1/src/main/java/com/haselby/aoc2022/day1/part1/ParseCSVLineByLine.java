package com.haselby.aoc2022.day1.part1;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

// Attribution: https://howtodoinjava.com/java/library/parse-read-write-csv-opencsv/

public class ParseCSVLineByLine {

    @SuppressWarnings("resource")
    public static void goAhead() {

        try {

            URL fileUrl = ParseCSVLineByLine.class.getClassLoader().getResource("input.txt");

            //Build reader instance
            //Read data.csv
            //Default separator is comma
            //Start reading from line number 2 (line numbers start from zero)
            CSVParser csvParser = new CSVParserBuilder()
                    .withSeparator(',')
                    .withIgnoreQuotations(true)
                    .build();

            CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileUrl.getFile()))
                    .withSkipLines(1)
                    .withCSVParser(csvParser)
                    .build();

            //Read CSV line by line and use the string array as you want
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                if (nextLine != null) {
                    //Verifying the read data here
                    System.out.println(Arrays.toString(nextLine));
                }
            }
        }
        catch(Exception e){
                e.printStackTrace();
            }
        }
    }
