package OOP_projects.Labs__2_7.LabWork__2_7_6_till_2_7_10.testshapes;

public class Main {
    public static void main(String[] args) {

        final int KINDS_OF_SHAPES= 3;
        double sumOfTotalArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        Shape[][] shapes = new Shape[KINDS_OF_SHAPES][];
        // а зачем тут вообще нужен двумерный массив?
        shapes[0] = new Shape[5];   // Why without this line is NullPointerException ?
        shapes[0][0] = new Rectangle("RED", 11,22);
        shapes[0][1] = new Rectangle("YELLOW", 10,21);
        shapes[0][2] = new Rectangle("BROWN", 12,20);
        shapes[0][3] = new Rectangle("GREY", 9,19);
        shapes[0][4] = new Rectangle("PINK", 113,18);

        shapes[1] = new Shape[2];   // THIS LINE ?
        shapes[1][0] = new Circle("GREEN", 10);
        shapes[1][1] = new Circle("BLUE", 11);

        shapes[2] = new Shape[2];   // AND THIS ?
        shapes[2][0] = new Triangle("BLACK", 5,5,5);
        shapes[2][1] = new Triangle("ORANGE", 7,7,7);

        for (Shape[] shapeType : shapes) {
            for (Shape shape : shapeType)
            System.out.println("This is " + shape.toString() + "\n"
                    + "Shape area is: " + shape.calculateArea() + "\n");
        }

        for (Shape[] shapeType : shapes) {
            for (Shape shape : shapeType)
            sumOfTotalArea += shape.calculateArea();
        }
        System.out.println("The TOTAL AREA of all figures together: " + sumOfTotalArea + "\n");

        for (Shape[] shapeType : shapes) {
            for (Shape shape : shapeType){
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
        }
        System.out.println("Rectangles total area: " + sumRectArea + "\n"
                         + "Triangles total area: " + sumTriangleArea + "\n"
                         + "Circles total area: " + sumCircleArea + "\n");
    }
}
