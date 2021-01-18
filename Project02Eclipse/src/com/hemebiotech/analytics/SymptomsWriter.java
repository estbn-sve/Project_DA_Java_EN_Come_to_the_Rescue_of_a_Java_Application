package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class SymptomsWriter extends SymptomsReader{

    public SymptomsWriter(TreeMap<String, Integer> symptomsInput){
        this.symptomsInput = symptomsInput;
    }

    public void symptomsWriter(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
        } catch (IOException e) {
            System.err.println("Writing error.");
            System.exit(3);
        }
        for (int i = 0; i<symptomsInput.size(); i++){
            try {
                writer.write("Symptoms : " + symptomsInput);
            } catch (IOException e) {
                System.err.println("Error line "+ i +" to writing.");
                System.exit(4);
            }
        }

        /*for (int i = 0; i< symptomsCount.length ; i++){
            String result = symptomsCount[i][0];
            if (result != null ){
                try {
                    writer.write("Symptoms : " + symptomsCount<String> + " occurrences numbers " + symptomsCount<Integer> + "." + "\n");
                } catch (IOException e) {
                    System.err.println("Error line "+ i +" to writing.");
                    System.exit(4);
                }
            }
        }*/
        try {
            writer.close();
        } catch (IOException e) {
            System.err.println("Error closing writer.");
            System.exit(5);
        }
    }
}
