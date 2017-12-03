package oop.Labs__14.LabWork__2_14_3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int MAX_INT_VALUE = 3;
        final double MAX_DOUBLE_VALUE = 3.0;
        Random rand = new Random();
        Integer[] intNumbers = new Integer[10];
        if(intNumbers.length > 0){
            for (int i = 0; i < intNumbers.length; i++) {
                intNumbers[i] = rand.nextInt(10);
            }
        }
        System.out.printf("Array values: %s\nSum of elements that are greater than 3:\n%d%n",
                Arrays.toString(intNumbers), MyTestMethod.calculateSum(intNumbers, MAX_INT_VALUE));
        System.out.println();

        Double[] doubleNumbers = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };
        if(intNumbers.length > 0){
            System.out.printf("Array values: %s\nSum of elements that are greater than 3:\n%s%n",
                    Arrays.toString(doubleNumbers), MyTestMethod.calculateSum(doubleNumbers, MAX_DOUBLE_VALUE));
        }
    }
}
