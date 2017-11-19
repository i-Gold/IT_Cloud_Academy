package OOP_projects.Labs__2_7.LabWork__2_7_6_till_2_7_10.testshapes;

public abstract class Shape {

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

    public double calculateArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape color is: " + getColor();
    }
}
