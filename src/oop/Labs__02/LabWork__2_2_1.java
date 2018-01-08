package oop.Labs__02;
import java.util.Random;

public class LabWork__2_2_1 {
    public static void main(String[] args) {

        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];

        Random random = new Random();

        for (int row = 0; row < matrix1.length; row++){
            for (int cell = 0; cell < matrix1[row].length; cell++){

                matrix1[row][cell] = random.nextInt(5);
            }
        }

        for (int row = 0; row < matrix2.length; row++){
            for (int cell = 0; cell < matrix2[row].length; cell++){

                matrix2[row][cell] = random.nextInt(5);
            }
        }

        System.out.println("First:");
        Matrix.printMatrix(matrix1);
        System.out.println();

        System.out.println("Second:");
        Matrix.printMatrix(matrix2);
        System.out.println();

        System.out.println("Addition of two matrix:");
        Matrix.printMatrix(Matrix.additionOfMatrices(matrix1, matrix2));
        System.out.println();

        System.out.println("Multiplying of two matrix:");
        Matrix.printMatrix(Matrix.multiplyingOfMatrices(matrix1, matrix2));
        System.out.println();
    }
}

class Matrix {

    public static int[][] additionOfMatrices(int[][] matrix1, int[][] matrix2){

        final int HEIGHT = matrix1.length;
        final int WIDTH = matrix1[0].length;

        if (matrix1 == null || matrix2 == null || matrix2.length != HEIGHT || matrix2[0].length != WIDTH) {
            System.out.println("Can not to add matrices with different size!");
            return null;
        }
        int[][] result = new int[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyingOfMatrices(int[][] matrix1, int[][] matrix2){

        final int HEIGHT1 = matrix1.length;
        final int WIDTH1 = matrix1[0].length;
        final int HEIGHT2 = matrix2.length;
        final int WIDTH2 = matrix2[0].length;

        if (WIDTH1 != HEIGHT2) {
            System.out.println("Can not to multiply matrices with different size!");
            return null;
        }

        int[][] result = new int[HEIGHT1][WIDTH2];

        for (int i = 0; i < HEIGHT1; i++) {

            for (int j = 0; j < WIDTH2; j++) {

                for (int k = 0; k < HEIGHT2; k++) {

                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix){

        if (matrix == null) {
            System.out.println("Something wrong!" + "\n");
            return;
        }
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
