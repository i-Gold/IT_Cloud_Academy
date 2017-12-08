package oop.Labs__15.LabWork__2_15_5;

public class Main {
    public static void main(String[] args) {

        MyNumGenerator generator = new MyNumGenerator(5, 64);
        generator.generate();
        System.out.println("HashSet: " + generator.generateDistinct());
    }
}
