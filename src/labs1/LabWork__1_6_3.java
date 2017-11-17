package labs1;

public class LabWork__1_6_3 {

    public static void main(String[] args) {

        int[][] array2D = new int[4][4];

        array2D[0] = new int[] { 1, 5, 9,  13};
        array2D[1] = new int[] { 2, 6, 10, 14};
        array2D[2] = new int[] { 3, 7, 11, 15};
        array2D[3] = new int[] { 4, 8, 12, 16};

        for (int row = 0; row < array2D.length; row++){

            for (int column = 0; column < array2D[row].length; column++){

                System.out.print(array2D[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
