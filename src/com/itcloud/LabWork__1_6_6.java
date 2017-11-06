package com.itcloud;
import java.util.Arrays;

public class LabWork__1_6_6 {

    public static void main(String[] args) {

        int months = 12;
        int[] avgTemperature2015 = new int[months];

        int minTemperature = -20;
        int maxTemperature = 30;

        for (int i = 0; i < avgTemperature2015.length; i++) {

            avgTemperature2015[i] = minTemperature + (int)(Math.random() * maxTemperature);

            if (Math.round(Math.random() * 100) % 2 == 0) {
                avgTemperature2015[i] *= -1;
            }
        }

        System.out.println("AVERAGE temperature of months in 2015 are: " + "\n"
                            + Arrays.toString(avgTemperature2015) + "\n");


        System.out.println("SORTED temperature: ");

        for (int i = 0; i < avgTemperature2015.length; i++) {

            if (avgTemperature2015[i] >= 0) {

                for (int j = i + 1; j < avgTemperature2015.length ; j++) {

                    if (avgTemperature2015[j] < 0) {

                        int tmp = avgTemperature2015[j];
                        avgTemperature2015[j] = avgTemperature2015[i];
                        avgTemperature2015[i] = tmp;

                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(avgTemperature2015));
    }
}
