package labs1;

import java.util.Arrays;

public class LabWork__1_6_5 {

    public static void main(String[] args) {

        int[][] matrix = {{7,7,7,7},
                          {1,1,1,1},
                          {3,3,3,3},
                          {6,6,6,6}};

        System.out.println("The matrix:");
        for (int i = 0; i < matrix.length; i++){

            System.out.println(Arrays.toString(matrix[i]) + "\t");
        }

        int[][] transposedMatrix = new int[4][4];

        for (int i = 0; i < transposedMatrix.length; i++){

            for (int j = 0; j < transposedMatrix[i].length; j++){

                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTransported matrix: ");

        for (int i = 0; i < transposedMatrix.length; i++){

            System.out.println(Arrays.toString(transposedMatrix[i]));
        }
    }
}
