package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class SymptomsReader {

    public ArrayList<String> symptomsInput = new ArrayList<>();

    public void symptomsreader(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("symptoms.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non  trouvé.");
            System.exit(1);
        }

        reader.lines().forEach(readLine -> {
            symptomsInput.add(readLine);
        });
    }

    public ArrayList<String> getSymptomslist() {
        return symptomsInput;
    }


}
