package com.itcloud;

public class LabWork__1_6_3 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        matrix[0][0] = 1;
        matrix[0][1] = 5;
        matrix[0][2] = 9;
        matrix[0][3] = 13;

        matrix[1][0] = 2;
        matrix[1][1] = 6;
        matrix[1][2] = 10;
        matrix[1][3] = 14;

        matrix[2][0] = 3;
        matrix[2][1] = 7;
        matrix[2][2] = 11;
        matrix[2][3] = 15;

        matrix[3][0] = 4;
        matrix[3][1] = 8;
        matrix[3][2] = 12;
        matrix[3][3] = 16;

        for (int row = 0; row < matrix.length; row++){

            for (int column = 0; column < matrix[row].length; column++){

                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
