package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeMap;

public class SymptomsReader {
    private static final String INPUT_FILE = "symptoms.txt";
    public TreeMap<String, Integer> symptomsInput = new TreeMap<>();

    public boolean readSymptoms(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(INPUT_FILE));
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé.");
            return false;
        }
        reader.lines().forEach(readLine -> {
            if (symptomsInput.containsKey(readLine)) {
                symptomsInput.put(readLine, symptomsInput.get(readLine) + 1);
            } else {
                symptomsInput.put(readLine, 1);
            }
        });
        return true;
    }

    public TreeMap<String, Integer> getSymptomsInput() {
        return symptomsInput;
    }

}