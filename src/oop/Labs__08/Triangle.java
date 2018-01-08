package oop.Labs__08;

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
