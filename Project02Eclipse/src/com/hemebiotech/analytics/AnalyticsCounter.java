package com.hemebiotech.analytics;

import java.lang.String;

public class AnalyticsCounter {


    public static void main(String[] args){
        SymptomsReader startSymptomsReader = new SymptomsReader();
        if (startSymptomsReader.readSymptoms()) {
            SymptomsWriter StartSymptomsWriter = new SymptomsWriter(startSymptomsReader.getSymptomsInput());
            StartSymptomsWriter.writeSymptoms();
        }
    }
}