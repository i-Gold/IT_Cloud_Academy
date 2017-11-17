package labs1;

public class Lab_Work___1_5_3 {

    public static void main(String[] args) {

        for (int i = 0; i <= 0; i++){

            System.out.print("* | ");

            for (int j = 1; j <= 9; j++){

                System.out.print(j + " ");
            }
            System.out.println("\n-----------------------------");
        }

        for (int i = 1; i <= 9; i++){

            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++){

                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
