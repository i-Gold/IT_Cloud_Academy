package OOP_projects.Labs__2_6.lab__2_6_5.com.brainacad.calc;

import OOP_projects.Labs__2_6.lab__2_6_5.com.brainacad.shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(2.5,2.5,2.5);
        System.out.println(triangle.getArea());
    }
}
