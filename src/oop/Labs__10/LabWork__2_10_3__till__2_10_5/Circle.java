package oop.Labs__10.LabWork__2_10_3__till__2_10_5;

import java.util.StringTokenizer;

public class Circle extends Shape implements Comparable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public static Circle parseCircle(String circle) {
        String[] circleArray = circle.split(":");
        return new Circle(circleArray[1], Double.parseDouble(circleArray[2]));
    }

    @Override
    public String toString() {
        return "Circle color is: " + super.getColor() +
                ", radius = " + radius;
    }

    @Override
    public void draw() {
        System.out.println("This is " + toString() + ", area is: " + calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calculateArea() < circle.calculateArea()) return -1; {
        if (this.calculateArea() > circle.calculateArea()) return 1;
        return 0;
        }
    }
}
