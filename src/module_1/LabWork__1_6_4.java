package module_1;

import java.util.Arrays;

public class LabWork__1_6_4 {

    public static void main(String[] args) {

        int[] myArray = new int[]{2,10,7,25,8,65};

        for(int i = 0; i < myArray.length; i++){

            int valueForSearch = 25;

            if (valueForSearch == myArray[i]){

                System.out.println("UNSORTED ARRAY:" + "\n"
                                 + "Index of 25 is — " + i + "\n");
            }
        }

        Arrays.sort(myArray);

        System.out.println("SORTED ARRAY:" + "\n"
                         + "25 located in this index — " + Arrays.binarySearch(myArray, 25));
    }
}
