package module_1;

public class LabWork__1_6_1 {

    public static void main(String[] args) {

        int[] array = new int[30];

        for (int i = 0; i < array.length; i++){

            array[i] = i;
        }

        for (int i = 0; i < array.length; i++){

            if ( i % 2 == 0 && i > 0){

                System.out.print(array[i] + " ");
            }
        }
    }
}
