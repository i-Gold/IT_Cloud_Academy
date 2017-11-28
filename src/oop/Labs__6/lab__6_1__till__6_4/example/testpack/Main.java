package oop.Labs__6.lab__6_1__till__6_4.example.testpack;

import oop.Labs__6.lab__6_1__till__6_4.com.brainacad.carpack.Car;
import oop.Labs__6.lab__6_1__till__6_4.example.applepack.Apple;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Car car = new Car();
        apple.setWeight(0.25);
        car.setWeight(1200);
        System.out.println("Apple's weight: " + apple.getWeight() + "\n"
                         + "Car's weight: " + car.getWeight());
    }
}
