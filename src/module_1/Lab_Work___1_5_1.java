package module_1;

public class Lab_Work___1_5_1 {

    public static void main(String[] args) {

        final byte lastRow = 8;

        for (int i = 1; i <= lastRow; i++){

            for (int j = i; j >= 1; j--){

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
