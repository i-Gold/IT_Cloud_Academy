package oop.Labs__10.LabWork__2_10_3__till__2_10_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Shape.parseShape("Rectangle:RED:10,20").toString() + "\n"
                         + Shape.parseShape("Triangle:GREEN:9,7,12").toString() + "\n"
                         + Shape.parseShape("Circle:BLACK:10").toString() + "\n");
        System.out.println("******************************************");


        System.out.print("How much shapes do u want?: ");
        Scanner sc = new Scanner(System.in);
        final int SHAPES_LENGTH = Integer.parseInt(sc.nextLine());
        Shape[] shapes = new Shape[SHAPES_LENGTH];

        System.out.print("What shape do u want (example — Rectangle:RED:11,22) ? : ");
        for (int i = 0; i < SHAPES_LENGTH - 1; i++) {
            shapes[i] = Shape.parseShape(sc.nextLine());
        }
        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}
