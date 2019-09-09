package com.liampkenna.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Craig","Dennis",5,"Loved it!");
            printer.printRecord("Dave","Ram",4,"Not to bad, I think.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
