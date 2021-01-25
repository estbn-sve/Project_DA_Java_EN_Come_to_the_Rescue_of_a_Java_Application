package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class SymptomsWriter extends SymptomsReader{

    public SymptomsWriter(TreeMap<String, Integer> symptomsInput){
        this.symptomsInput = symptomsInput;
    }

    public void writeSymptoms(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
        } catch (IOException e) {
            System.err.println("Create writer file error.");
            Runtime.getRuntime().halt(1);
        }

        try {
            writer.write("Symptoms : " + symptomsInput);
        } catch (IOException e) {
            System.err.println("Error to writing.");
            Runtime.getRuntime().halt(1);
        }
        finally {
            Runtime.getRuntime().halt(1);
        }

        try {
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writer closing.");
            Runtime.getRuntime().halt(1);
        }
        finally {
            Runtime.getRuntime().halt(1);
        }
    }
}
