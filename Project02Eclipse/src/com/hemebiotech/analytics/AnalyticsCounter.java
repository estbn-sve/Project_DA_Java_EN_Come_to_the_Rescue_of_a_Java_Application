package com.hemebiotech.analytics;

import java.lang.String;

public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {
        SymptomsReader.symptomsreader();
        DataSymptoms.datasymptoms();
        SymptomsWriter.symptomswriter();
    }
}