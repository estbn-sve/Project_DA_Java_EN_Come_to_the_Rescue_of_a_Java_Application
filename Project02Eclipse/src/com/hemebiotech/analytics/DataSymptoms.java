package com.hemebiotech.analytics;

import javax.xml.crypto.Data;
import java.util.*;

public class DataSymptoms extends SymptomsReader {

    private Set<String> setsymptoms; // HashSet to delete double.
    private ArrayList<String> symptomslist2; // List with not double to compare to count.
    public String[][] symptomsCount;

    public DataSymptoms(TreeMap<String, Integer> symptomsInput) {
        this.symptomsInput = symptomsInput;
        /*setsymptoms = new HashSet<>(symptomsInput);
        symptomslist2 = new ArrayList<>(setsymptoms);
        symptomsCount = new String[symptomslist2.size()][2];*/
    }


    /*public void countSymptoms(){

        for (int a = 0; a < symptomslist2.size(); a++) {
            Collections.sort(symptomslist2);
            String result1 = symptomslist2.get(a);
            int count = 0;
            for (int b = 0; b < symptomsInput.size(); b++) {
                String result2 = symptomsInput.get(b);
                if (result1.equals(result2)) {
                    count++;
                }
            }
            String strCount = Integer.toString(count);
            symptomsCount[a][0] = result1;
            symptomsCount[a][1] = strCount;
        }
    }*/

    public String[][] getSymptomsCount() {
        return symptomsCount;
    }
}
