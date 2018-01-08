package module_1;

public class LabWork__1_4_1 {

    public static void main(String[] args) {

        storyAboutPrimitiveDataTypes();
    }

    public static void storyAboutPrimitiveDataTypes(){

        byte byteMin = -128;
        byte byteMax = 127;

        int intMin = -2147483648;
        int intMax = 2147483647;

        short shortMin = -32768;
        short shortMax = 32767;

        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;

        float floatMin = 1.175494351e-38F;
        float floatMax = 3.402823466e+38F;

        double doubleMin = 2.2250738585072014e-308;
        double doubleMax = 1.7976931348623158e+308;

        char charSymb = '@';
        char charNumb = '\u0024';

        boolean bTrue = true;
        boolean bFalse = false;

        System.out.println("\n\t ONCE UPON A TIME there were a meeting of primitive data types \n"

                + "\n\t Hello! I'm   -Int-   data type. I can contain of different numbers, from " + intMin + " to " + intMax
                + "\n\t But my values are limited. \n"
                + "\t Also I have a younger brother Byte \n\n"

                + "\t Hi! I'm   -Byte-   \n"
                + "\t My values are less than has Int and limited too. \n"
                + "\t From " + byteMin + " to " + byteMax + "\n\n"

                + "\t My name is   -Short-   \n"
                + "\t The range of my values is between " + shortMin + " and " + shortMax + "\n\n"

                + "\t I'm   -Long-  \n"
                + "\t What about my values, they are from " + longMin + " to " + longMax + "\n\n"

                + "\t Nice to meet you all! My name is   -Float-  \n"
                + "\t I know that we have different limits of our values \n"
                + "\t As for my values... they must have the FRACTION part and shoud have letter -F- in the end of a value. \n"
                + "\t Like this from: " + floatMin + " to " + floatMax + "\n"
                + "\t And I have elder brother \n\n"

                + "\t Hey! My name is   -Double-   \n"
                + "\t My values like my brother Float has, but values are bigger and with letter -D- in the end \n"
                + "\t From: " + doubleMin + " to " + doubleMax + "\n"
                + "\t Hey, bro! Who are you? \n\n"

                + "\t Hi, guys! I'm   -Char-  \n"
                + "\t I came with my friend Boolean"
                + "\t What about my values, I have only symbols, like this one. But also I can take a number, \n"
                + "\t which will means a value of any symbol \n"
                + "\t So, this: "+ charSymb + " and this " + charNumb + "\n\n"

                + "\t Hello for everyone! I'm   -Boolean-   \n"
                + "\t I have only 2 values. And they are logical values. \n"
                + "\t So, here are: " + bTrue + " and " + bFalse + "\n\n"

                + "\t THE END");
    }
}
