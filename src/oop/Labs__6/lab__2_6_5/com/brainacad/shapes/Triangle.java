package oop.Labs__6.lab__2_6_5.com.brainacad.shapes;

import static java.lang.Math.sqrt;

public class Triangle {

    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double sides = (a + b + c) / 2;
        return sqrt(sides * (sides - a)*(sides - b)*(sides - c));
    }
}
