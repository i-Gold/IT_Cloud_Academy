package com.itcloud;

import java.util.Scanner;

public class Lab_Work___1_5_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1-st number: ");
        double firstNum = sc.nextDouble();

        System.out.print("\nEnter 2-nd number: ");
        double secondNum = sc.nextDouble();

        System.out.println(sumOfSquaresDigits(firstNum, secondNum));
    }

    public static double sumOfSquaresDigits(double first, double second){

        double sum = first*first + second*second;

        return sum;
    }
}
