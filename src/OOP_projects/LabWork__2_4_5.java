package OOP_projects;

public class LabWork__2_4_5 {
    public static void main(String[] args) {

        System.out.println(MyCalc.calcPI(10));
    }
}

class MyCalc {

    public static double calcPI(int n){
        double PI = 0;
        double chr = 1.0;   // the value of current term
        for (int i = 0; i < n; i++) {                           // It's not my solution
            chr = ((Math.pow(-1,  n)) * (1 / ((2 * n) + 1)));   // (I don't know algorithm of calculation number of PI)
        }                                                       // The solution from Google
        return PI *= 4;
    }
}