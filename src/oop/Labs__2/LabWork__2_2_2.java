package oop.Labs__2;
import java.util.Random;

public class LabWork__2_2_2 {
    public static void main(String[] args) {

        MatrixInstance matrix = new MatrixInstance();

        matrix.instanceOfMatrix(3,3);

        matrix.printMatrix();
    }
}

class MatrixInstance {

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void instanceOfMatrix(int height, int weight){

        Random random = new Random();

        matrix = new int[height][weight];

        for (int i = 0; i < height; i++){
            for (int j = 0; j < weight; j++){
                matrix[i][j] = random.nextInt(5);
            }
        }
    }

    public void printMatrix(){

        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.format(cell + "\t");
            }
            System.out.println();
        }
    }
}
