package oop.Labs__10.LabWork__2_10_1;

public class Main {
    public static void main(String[] args) {

        Integer x1 = 25;
        Integer x2 = new Integer(25);
        Integer x3 = Integer.valueOf(25);
        Integer x4 = Integer.parseInt("25");
        System.out.println("x1 == x2 : " + (x1 == x2) + "\t" + "x1 equals x2 : " + (x1.equals(x2)) + "\n"
                         + "x1 == x3 : " + (x1 == x3) + "\t\t" + "x1 equals x3 : " + (x1.equals(x3)) + "\n"
                         + "x1 == x4 : " + (x1 == x4) + "\t\t" + "x1 equals x4 : " + (x1.equals(x4)) + "\n\n"
                         + "x2 == x3 : " + (x2 == x3) + "\t" + "x2 equals x3 : " + (x2.equals(x3)) + "\n"
                         + "x2 == x4 : " + (x1 == x3) + "\t\t" + "x2 equals x4 : " + (x2.equals(x4)) + "\n\n"
                         + "x3 == x4 : " + (x3 == x4) + "\t\t" + "x3 equals x4 : " + (x3.equals(x4)) + "\n"
                         + "*******************************************");

        Integer x5 = 130;
        Integer x6 = new Integer(130);
        Integer x7 = Integer.valueOf(130);
        Integer x8 = Integer.parseInt("130");
        System.out.println("x5 == x6 : " + (x5 == x6) + "\t" + "x5 equals x6 : " + (x5.equals(x6)) + "\n"
                + "x5 == x7 : " + (x5 == x7) + "\t" + "x5 equals x7 : " + (x5.equals(x7)) + "\n"
                + "x5 == x8 : " + (x5 == x8) + "\t" + "x5 equals x8 : " + (x5.equals(x8)) + "\n\n"
                + "x6 == x7 : " + (x6 == x7) + "\t" + "x6 equals x7 : " + (x6.equals(x7)) + "\n"
                + "x6 == x8 : " + (x6 == x8) + "\t" + "x6 equals x8 : " + (x6.equals(x8)) + "\n\n"
                + "x7 == x8 : " + (x7 == x8) + "\t" + "x7 equals x8 : " + (x7.equals(x8)));
    }
}
