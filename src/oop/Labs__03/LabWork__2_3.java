package oop.Labs__03;

public class LabWork__2_3 {
    public static void main(String[] args) {

        MyWindow window = new MyWindow();

        window.getArrayOfWindows();

//        MyWindow firstWindow = new MyWindow();
//        MyWindow secondWindow = new MyWindow(150,200);
//        MyWindow thirdWindow = new MyWindow(165.5,180,5);
//
//        firstWindow.printFields();
//        secondWindow.printFields();
//        thirdWindow.printFields();
    }
}

class MyWindow {

    private double height;
    private double length;
    private int numberOfGlass;
    private String color;
    private boolean isOpen = true;

    public MyWindow(){

        this(165.5, 200, 4, "Blue");
    }
    public MyWindow(double height, double length){

        this(height, length, 4, "Blue");
    }
    public MyWindow(double height, double length, int numberOfGlass){

        this(height, length, numberOfGlass, "Blue");
    }
    public MyWindow(double height, double length, int numberOfGlass, String color){

        this.height = height;
        this.length = length;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    public MyWindow[] getArrayOfWindows(){

        final int COMPONENTS_OF_WINDOW = 4;

        MyWindow[] window = new MyWindow[COMPONENTS_OF_WINDOW];

        window[0] = new MyWindow();
        window[1] = new MyWindow(100.5,135);
        window[2] = new MyWindow(145,160.5,4);
        window[3] = new MyWindow(150,170.5,4,"Grey");

        for (MyWindow cell : window){

            cell.printFields();
        }

        return window;
    }

    public void printFields() {

        System.out.println("Height: "  + this.height + "\n"
                         + "Length: " + this.length + "\n"
                         + "Number Of Glasses: " + this.numberOfGlass + "\n"
                         + "Color: " + this.color + "\n"
                         + "is Open: " + this.isOpen + "\n");
    }
}