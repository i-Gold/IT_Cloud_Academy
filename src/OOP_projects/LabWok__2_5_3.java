package OOP_projects;

import java.util.Arrays;
import java.util.Random;

public class LabWok__2_5_3 {
    public static void main(String[] args) {

        MyInit testArray1 = new MyInit();
        testArray1.printArray();
        System.out.println();

        MyInit testArray2 = new MyInit();
        testArray2.printArray();
    }
}

class MyInit2 {

    //private final static int SIZE_OF_ARRAY = 10;
    private static int[] array = new int[10];
    Random random = new Random();

    {
        for (int i = 0; i < 10; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(){
        System.out.print(Arrays.toString(array));
    }
}
