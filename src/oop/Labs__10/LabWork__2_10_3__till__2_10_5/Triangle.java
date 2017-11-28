package oop.Labs__10.LabWork__2_10_3__till__2_10_5;

import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Triangle extends Shape implements Comparable{

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a)*(s - b)*(s - c));
    }

    public static Triangle parseTriangle(String triangle) {
        String[] triangleArray = triangle.split(":");
        String[] dimensions = triangleArray[2].split(",");
        return new Triangle(triangleArray[1],
                Double.parseDouble(dimensions[0]),
                Double.parseDouble(dimensions[1]),
                Double.parseDouble(dimensions[2]));
    }

    @Override
    public String toString() {
        return "Triangle color is: " + super.getColor() +
                ", a = " + a +
                ", b = " + b +
                ", b = " + c;
    }

    @Override
    public void draw() {
        System.out.println("This is " + toString() + ", area is: " + calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calculateArea() < triangle.calculateArea()) return -1; {
            if (this.calculateArea() > triangle.calculateArea()) return 1;
            return 0;
        }
    }
}
