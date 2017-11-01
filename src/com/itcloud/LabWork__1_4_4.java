package com.itcloud;

public class LabWork__1_4_4 {

    public static void main(String[] args) {

        int number = 100;
        int preIncrement = ++number;

        number = 100;
        int postIncrement = number++;

        number = 100;
        int preDecrement = --number;

        number = 100;
        int postDecrement = number--;

        System.out.println("Prefix Inc: " + preIncrement + "\n" + "Postfix Inc: " + postIncrement + "\n\n"
                         + "Prefix Dec: " + preDecrement + "\n" + "Postfix Dec: " + postDecrement);
    }
}
