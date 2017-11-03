package com.itcloud;

import java.util.Scanner;

public class Lab_Work___1_5_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("The perfect numbers are: ");

        for (int i = 1; i <= n; i++)
        {
            int sum = 0;

            for (int j = 1; j <= i/2; j++){

                if(i % j == 0)
                {
                    sum += j;
                }
            }
            if(sum == i){

                System.out.print(i + " ");
            }
        }
    }
}
