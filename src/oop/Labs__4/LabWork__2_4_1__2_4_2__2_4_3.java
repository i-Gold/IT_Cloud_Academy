package oop.Labs__4;
import java.util.Arrays;

public class LabWork__2_4_1__2_4_2__2_4_3 {
    public static void main(String[] args) {

        final int SIZE_OF_ARRAY = 7;

        System.out.println("Creating 2 arrays:");
        int[] firstArray = Calculation.createArray(SIZE_OF_ARRAY);
        int[] secondArray = Calculation.createArray(SIZE_OF_ARRAY);

        System.out.println(Arrays.toString(firstArray) + "\n"
                         + Arrays.toString(secondArray) + "\n");

        System.out.println("Minimal value of the 1-st array: " + MyMath.findMin(firstArray) + "\n");
        System.out.println("Maximal value of the 2-nd array: " + MyMath.findMin(secondArray) + "\n");

        System.out.println("The radius of circle: " + "\n" + MyMath.areaOfCircle(7.5) + "\n");
    }
}

class MyMath {

    private final static double PI = 3.141592653589793238462643;

    public static double areaOfCircle(double radius){

        return radius * radius * PI;
    }

    public static int findMin(int[] array){

        int minValue = array[0];

        for (int element : array){
            if(element < minValue){
                minValue = element;
            }
        }
        return minValue;
    }

    public static int findMax(int[] array){

        int maxValue = array[0];

        for (int element : array){
            if(element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }
}

class Calculation {

    public static int[] createArray(int sizeOfArray){

        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            array[i] = 5 + (int)(Math.random()*25);
        }
        return array;
    }
}
