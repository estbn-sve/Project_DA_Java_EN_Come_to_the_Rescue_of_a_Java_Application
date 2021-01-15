package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SymptomsReader {

    public static ArrayList<String> symptomslist = new ArrayList<>();

    public static void symptomsreader() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));

        reader.lines().forEach(readLine -> {
            symptomslist.add(readLine);
        });
    }

    public static ArrayList<String> getSymptomslist() {
        return symptomslist;
    }


}
