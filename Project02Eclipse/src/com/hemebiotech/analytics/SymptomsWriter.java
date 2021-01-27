package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsWriter extends SymptomsReader{
    private static final String OUT_FILE="result.out";

    public SymptomsWriter(TreeMap<String, Integer> symptomsInput){
        this.symptomsInput = symptomsInput;
    }

    public void writeSymptoms(){
        FileWriter writer;
        try {
            writer = new FileWriter(OUT_FILE);
        } catch (IOException e) {
            System.err.println("Create writer file error.");
            return;
        }
        for (Map.Entry<String, Integer> symptom:symptomsInput.entrySet()){
            try {
                writer.write("Symptoms : " + symptom.getKey() + " = " +symptom.getValue() + "\n");
            } catch (IOException e) {
                System.err.println("Error to writing.");
                return;
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writer closing.");
        }
    }
}
