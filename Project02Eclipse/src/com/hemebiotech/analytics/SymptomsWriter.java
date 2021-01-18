package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;

public class SymptomsWriter extends DataSymptoms{

    public SymptomsWriter(String[][2] symptomsCount) {
        this.symptomsCount = symptomsCount;
    }

    public void symptomsWriter(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
        } catch (IOException e) {
            System.err.println("Writing error.");
            System.exit(3);
        }
        for (int i = 0; i< symptomsCount.length ; i++){
            String result = symptomsCount[i][0];
            if (result != null ){
                try {
                    writer.write("Symptoms : " + symptomsCount[i][0] + " occurrences numbers " + symptomsCount[i][1] + "." + "\n");
                } catch (IOException e) {
                    System.err.println("Error line "+ i +" to writing.");
                    System.exit(4);
                }
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.err.println("Error closing writer.");
            System.exit(5);
        }
    }
}
