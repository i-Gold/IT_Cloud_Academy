package oop.Labs__15.LabWork__2_15_4;

public class Main {
    public static void main(String[] args) {

        MyNumGenerator generator = new MyNumGenerator(5, 64);
        System.out.println(generator.generate());
    }
}
