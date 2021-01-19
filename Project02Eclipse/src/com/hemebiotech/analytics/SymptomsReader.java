package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class SymptomsReader {
    public TreeMap<String, Integer> symptomsInput = new TreeMap<>();

    public void readSymptoms() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("symptoms.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non  trouvé.");
            System.exit(1);
        }
        reader.lines().forEach(readLine -> {
            if (symptomsInput.containsKey(readLine)) {
                symptomsInput.put(readLine, symptomsInput.get(readLine) + 1);
            } else {
                symptomsInput.put(readLine, 1);
            }
        });

    }

    public TreeMap<String, Integer> getSymptomsInput() {
        return symptomsInput;
    }

}