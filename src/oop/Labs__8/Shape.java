package oop.Labs__8;

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

    @Override
    public String toString() {
        return "Shape color is: " + color;
    }
}
