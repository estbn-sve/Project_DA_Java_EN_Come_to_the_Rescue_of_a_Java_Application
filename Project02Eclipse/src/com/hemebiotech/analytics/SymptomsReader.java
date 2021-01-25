package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeMap;

public class SymptomsReader {
    public TreeMap<String, Integer> symptomsInput = new TreeMap<>();

    public void readSymptoms(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("symptoms1.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé.");
            Runtime.getRuntime().halt(1);
        }
        finally {
            Runtime.getRuntime().halt(1);
        }
        assert reader != null;
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