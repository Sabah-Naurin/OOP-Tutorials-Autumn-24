package com.gpacalculator;

public class Student {
    String name;
    int[] creditArray = new int[3];
    double[] gradeArray = new double[3];


    public double calculateGPA() {

        int totalCredits = 0;
        double qualityPoint = 0;

        for (int i =0; i < 3; i++) {
            qualityPoint += creditArray[i] * gradeArray[i];
            totalCredits += creditArray[i];
        }

        return qualityPoint / totalCredits;
    }
}
