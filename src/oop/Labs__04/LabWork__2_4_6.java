package oop.Labs__04;

import java.util.Scanner;

public class LabWork__2_4_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height of a pyramid, not higher than NINE: ");
        int height = scanner.nextInt();

        MyPyramid.printPyramid(height);
    }
}

class MyPyramid {

    public static void printPyramid(int heightOfPyramid){

        if(heightOfPyramid > 0 && heightOfPyramid <= 9){
            for (int i = 0; i < heightOfPyramid; i++) {
                for (int p = heightOfPyramid - i; p > 0; p--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int k = i - 1; k >= 1; k--) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}