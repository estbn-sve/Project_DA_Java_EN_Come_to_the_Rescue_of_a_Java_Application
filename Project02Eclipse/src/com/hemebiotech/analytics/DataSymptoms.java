package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DataSymptoms extends SymptomsReader {

    private static Set<String> setsymptoms = new HashSet<>(symptomslist); // HashSet to delete double.
    private static ArrayList<String> symptomslist2 = new ArrayList<>(setsymptoms); // List with not double to compare to count.
    public static String[][] symptoms = new String[symptomslist2.size()][2];

    public static void datasymptoms() throws Exception {

        for (int a = 0; a < symptomslist2.size(); a++) {
            Collections.sort(symptomslist2);
            String result1 = symptomslist2.get(a);
            int count = 0;
            for (int b = 0; b < symptomslist.size(); b++) {
                String result2 = symptomslist.get(b);
                if (result1.equals(result2)) {
                    count++;
                }
            }
            String strcount = Integer.toString(count);
            symptoms[a][0] = result1;
            symptoms[a][1] = strcount;
        }
    }

    public static String[][] getSymptoms() {
        return symptoms;
    }
}
