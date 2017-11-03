package com.itcloud;

public class Lab_Work___1_5_5 {

    public static void main(String[] args) {

        int sum = 0;
        int averageValue = 0;
        int counter;

            for (int i = 1; i < 1000; i++){

                counter = i;
                sum += i;

                if (sum > 100){

                    break;
                }

                averageValue = sum / counter;
            }

        System.out.print("The Sum is: " + sum + "\n"
                       + "The Avg. is: " + averageValue);
    }
}
