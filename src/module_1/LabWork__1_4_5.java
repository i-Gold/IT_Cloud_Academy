package module_1;

public class LabWork__1_4_5 {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int shiftValue = 2;

        int bitShiftingLeft = a << shiftValue;
        int firstResult = bitShiftingLeft * b;

        int bitShiftingRight = a >> shiftValue;
        int secondResult = bitShiftingRight * b;

        System.out.println("Bit Shifting: 5 << 2 = " + bitShiftingLeft + "\n"
                         + "Result of Bit shifting * b = " + firstResult + "\n\n"

                         + "Bit Shifting: 5 >> 2 = " + bitShiftingRight + "\n"
                         + "Result of Bit shifting * b = " + secondResult);
    }
}
