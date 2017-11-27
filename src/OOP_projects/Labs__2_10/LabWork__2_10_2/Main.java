package OOP_projects.Labs__2_10.LabWork__2_10_2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Computing to new Long: " + compute(new Byte((byte) 120), new Integer(-10)));
    }

    public static Long compute(Byte Byte, Integer Int) {
        return new Long(Byte + Int);
    }
}
