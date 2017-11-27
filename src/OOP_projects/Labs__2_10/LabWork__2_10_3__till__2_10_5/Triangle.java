package OOP_projects.Labs__2_10.LabWork__2_10_3__till__2_10_5;

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
        String[] triangleArray = new String[]{triangle};
        StringTokenizer sk = new StringTokenizer(triangle, ":,");
        for (int i = 0; i < triangle.length(); i++) {
            while (sk.hasMoreElements()) {
                triangleArray[i] = sk.nextElement().toString();
            }
        }
        return new Triangle(triangleArray[0],
                            Double.parseDouble(triangleArray[1]),
                            Double.parseDouble(triangleArray[2]),
                            Double.parseDouble(triangleArray[3]));
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
