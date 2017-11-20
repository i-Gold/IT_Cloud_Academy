package OOP_projects.Labs__2_8;

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

        for (Rectangle rectangle : nextRectangle) {
            rectangle.draw();
        }
    }
}
