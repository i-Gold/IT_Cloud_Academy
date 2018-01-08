package oop.Labs__05;
import java.util.Arrays;
import java.util.Random;

public class LabWork__2_5_2 {
    public static void main(String[] args) {

        MyInit firstArray = new MyInit();
        MyInit secondArray = new MyInit();

        firstArray.printArray();
        System.out.println();
        secondArray.printArray();
    }
}

class MyInit {

    private final int SIZE_OF_ARRAY = 10;
    private int[] array = new int[SIZE_OF_ARRAY];
    Random random = new Random();

    {
        for (int i = 0; i < SIZE_OF_ARRAY; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(){
        System.out.print(Arrays.toString(array));
    }
}
