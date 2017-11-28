package oop.Labs__7.LabWork__2_7_6_till_2_7_10.testshapes;

public class Circle extends Shape {

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

    @Override
    public String toString() {
        return "Circle color is: " + super.getColor() +
                ", radius = " + radius;
    }
}
