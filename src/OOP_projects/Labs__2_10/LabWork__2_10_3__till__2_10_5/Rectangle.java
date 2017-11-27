package OOP_projects.Labs__2_10.LabWork__2_10_3__till__2_10_5;

import java.util.StringTokenizer;

public class Rectangle extends Shape implements Comparable {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public static Rectangle parseRectangle(String rectangle) {
        String[] rectangleArray = new String[]{};
        StringTokenizer sk = new StringTokenizer(rectangle, ":,");
        for (int i = 0; i < rectangle.length() - 1; i++) {
            while (sk.hasMoreElements()) {
                rectangleArray[i] = sk.nextElement().toString();
            }
        }
        return new Rectangle(rectangleArray[0],
                             Double.parseDouble(rectangleArray[1]), Double.parseDouble(rectangleArray[2]));
    }

    @Override
    public String toString() {
        return "Rectangle color is: " + super.getColor() +
                ", width = " + width +
                ", height = " + height;
    }

    @Override
    public void draw() {
        System.out.println("This is " + toString() + ", area is: " + calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calculateArea() < rectangle.calculateArea()) return -1; {
            if (this.calculateArea() > rectangle.calculateArea()) return 1;
            return 0;
        }
    }
}
