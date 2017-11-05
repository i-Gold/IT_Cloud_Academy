package com.itcloud;

public class LabWork__1_6_2 {

    public static void main(String[] args) {

        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };

        int minValue = m[0];
        int maxValue = m[0];
        int averageValue = 0;

        for (int value : m){

            if (value < minValue){

                minValue = value;       // Minimal value
            }
            if (value > maxValue){

                maxValue = value;       // Maximal value
            }

            averageValue += value;      // Preparing to find out the average value
        }

        averageValue /= m.length;       // Calculating the average value

        System.out.print("Minimal value is: " + minValue + "\n"
                       + "Maximal value is: " + maxValue + "\n"
                       + "Average value is: " + averageValue);
    }
}
