package com.hemebiotech.analytics;

import java.lang.String;

public class AnalyticsCounter {


    public static void main(String args[]){
        SymptomsReader startSymptomsReader = new SymptomsReader();
        startSymptomsReader.symptomsreader();

//        DataSymptoms startCountSymptoms = new DataSymptoms(startSymptomsReader.getSymptomsInput());
//        startCountSymptoms.countSymptoms();

        SymptomsWriter StartSymptomsWriter = new SymptomsWriter(startSymptomsReader.getSymptomsInput());
        StartSymptomsWriter.symptomsWriter();

    }
}