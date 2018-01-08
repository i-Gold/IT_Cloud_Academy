package oop.Labs__17.LabWork_3_and_4;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int SIZE_OF_ARRAY = 1000;
        int[] myArray = new int[SIZE_OF_ARRAY];
        MySumCount sumCount1 = new MySumCount();
        sumCount1.setStartIndex(3);
        sumCount1.setStopIndex(10);

        MySumCount sumCount2 = new MySumCount();
        sumCount2.setStartIndex(5);
        sumCount2.setStopIndex(7);

        for (int i = 0; i < myArray.length; i++) {
            Random rand = new Random();
            myArray[i] = rand.nextInt(1000);
        }
        System.out.println("Random array: \n" + Arrays.toString(myArray));

        sumCount1.setValues(myArray);
        sumCount2.setValues(myArray);

        System.out.printf("First sum from %d index to %d:%n", sumCount1.getStartIndex(), sumCount1.getStopIndex());
        sumCount1.run();
        System.out.println(sumCount1.getResultSum());

        System.out.printf("Second sum from %d index to %d:%n", sumCount2.getStartIndex(), sumCount2.getStopIndex());
        sumCount1.run();
        System.out.println(sumCount1.getResultSum());
    }
}
