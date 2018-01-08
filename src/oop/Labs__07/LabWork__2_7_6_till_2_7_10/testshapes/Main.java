package oop.Labs__07.LabWork__2_7_6_till_2_7_10.testshapes;

public class Main {
    public static void main(String[] args) {

        final int KINDS_OF_SHAPES = 9;
        double sumOfTotalArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        Shape[] shapes = new Shape[KINDS_OF_SHAPES];

        shapes[0] = new Rectangle("RED", 11, 22);
        shapes[1] = new Rectangle("YELLOW", 10, 21);
        shapes[2] = new Rectangle("BROWN", 12, 20);
        shapes[3] = new Rectangle("GREY", 9, 19);
        shapes[4] = new Rectangle("PINK", 113, 18);

        shapes[5] = new Circle("GREEN", 10);
        shapes[6] = new Circle("BLUE", 11);

        shapes[7] = new Triangle("BLACK", 5, 5, 5);
        shapes[8] = new Triangle("ORANGE", 7, 7, 7);


        for (Shape shape : shapes) {
            System.out.println("This is " + shape.toString() + "\n"
                    + "Shape area is: " + shape.calculateArea() + "\n");
        }

        for (Shape shape : shapes) {
            sumOfTotalArea += shape.calculateArea();
        }
        System.out.println("The TOTAL AREA of all figures together: " + sumOfTotalArea + "\n");


        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                sumRectArea += shape.calculateArea();
            }
            if (shape instanceof Triangle) {
                sumTriangleArea += shape.calculateArea();
            }
            if (shape instanceof Circle) {
                sumCircleArea += shape.calculateArea();
            }
        }
        System.out.println("Rectangles total area: " + sumRectArea + "\n"
                + "Triangles total area: " + sumTriangleArea + "\n"
                + "Circles total area: " + sumCircleArea + "\n");
    }
}
