package oop.Labs__10.LabWork__2_10_3__till__2_10_5;

import java.util.StringTokenizer;

public abstract class Shape implements Drawable {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public static Shape parseShape(String string) {
        String[] shapeArray = new String[]{};
        StringTokenizer sk = new StringTokenizer(string, ":,");
        for (int i = 0; i < string.length() - 1; i++) {
            while (sk.hasMoreElements()) {
                shapeArray[i] = sk.nextElement().toString();
            }
        }
        switch (shapeArray[0]){
            case "Circle": {
                return Circle.parseCircle(string);
            }
            case "Triangle": {
                return Triangle.parseTriangle(string);
            }
            case "Rectangle": {
                return Rectangle.parseRectangle(string);
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "Shape color is: " + color;
    }
}
