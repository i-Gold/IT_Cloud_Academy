package module_1;

import java.util.Scanner;

public class Lab_Work___1_5_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("The perfect numbers are: ");

        for (int i = 1; i <= n; i++){

            int sumOfDivisors = 0;

            for (int j = 1; j < i; j++){

                if((i % j) == 0)
                {
                    sumOfDivisors += j;
                }
            }
            if(sumOfDivisors == i){

                System.out.print(i + " ");
            }
        }
    }
}
