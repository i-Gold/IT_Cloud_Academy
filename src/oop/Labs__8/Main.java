package oop.Labs__8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int QUANTITY_OF_SHAPES = 3;
        Shape[] shapes = new Shape[QUANTITY_OF_SHAPES];

        shapes[0] = new Rectangle("RED",11,22);
        shapes[1] = new Triangle("BLACK",5,5,5);
        shapes[2] = new Circle("GREEN",10);

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println("\nNEXT STAGE —>\n");

        Rectangle firstRectangle = new Rectangle("WHITE", 10,4);
        Rectangle secondRectangle = new Rectangle("GOLD", 15,5);

        System.out.println("If first bigger, result will be 1 | If second it will be -1 | " +
                           "If they are equal — 0\n" + "Result: " + firstRectangle.compareTo(secondRectangle));

        System.out.println("\nNEXT STAGE —>\n");


        final int QUANTITY_OF_RECTANGLES = 6;
        Rectangle[] nextRectangle = new Rectangle[QUANTITY_OF_RECTANGLES];

        nextRectangle[0] = new Rectangle("SILVER", 9,7);
        nextRectangle[1] = new Rectangle("BRONZE", 11,8);
        nextRectangle[2] = new Rectangle("DARK BLUE", 16,6);
        nextRectangle[3] = new Rectangle("AZURE", 10,8);
        nextRectangle[4] = new Rectangle("AQUA", 12,7);
        nextRectangle[5] = new Rectangle("CYAN", 15,9);

        System.out.println("SORTED BY AREA:");
        Arrays.sort(nextRectangle);
        for (Rectangle rectangle : nextRectangle) {
            rectangle.draw();
        }

        System.out.println("\nNEXT STAGE —>\n");

        Shape[] differentShapes = new Shape[10];
        differentShapes[0] = new Circle("Beige",11);
        differentShapes[1] = new Circle("AliceBlue",13);
        differentShapes[2] = new Circle("DodgerBlue ",10);
        differentShapes[3] = new Rectangle("LightSalmon ", 6,4);
        differentShapes[4] = new Rectangle("OliveDrab ", 17,10);
        differentShapes[5] = new Rectangle("FireBrick ", 11,9);
        differentShapes[6] = new Triangle("Teal",5,7,4);
        differentShapes[7] = new Triangle("Tomato",7,7,7);
        differentShapes[8] = new Triangle("PaleVioletRed ",4,5,4);
        differentShapes[9] = new Triangle("SpringGreen ",5,8,8);

        System.out.println("SORTED BY COLOR WITH COMPARATOR:");
        Arrays.sort(differentShapes, new ShapeColorComparator());
        for (Shape shape : differentShapes) {
            shape.draw();
        }
    }
}
