package module_1;

public class LabWork__1_4_6 {

    public static void main(String[] args) {

        int first = 7;
        int second = -7;

        System.out.println("7 & -7     --> \t   " + (first & second)+ "\n"
                         + "7 | -7     --> \t  " + (first | second) + "\n"
                         + "7 ^ -7     --> \t  " + (first ^ second) + "\n"
                         + "~7 \t\t   --> \t  " + (~first) + "\n"
                         + "7 >>> -7   -->\t   " + (first >>> second) + "\n");
    }
}
