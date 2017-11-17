package OOP_projects.Labs__2_5;

import java.util.Arrays;
import java.util.Random;

public class LabWork__2_5_4 {
    public static void main(String[] args) {

        MyInit thirdTestArray1 = new MyInit();
        System.out.println("1:");
        thirdTestArray1.printArray();

        MyInit thirdTestArray2 = new MyInit();
        System.out.println("2:");
        thirdTestArray2.printArray();
    }
}

class MyInit3 {

    //private final static int SIZE_OF_ARRAY = 10;
    private static int[] array = new int[10];


    static {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(){
        System.out.print(Arrays.toString(array));
    }
}