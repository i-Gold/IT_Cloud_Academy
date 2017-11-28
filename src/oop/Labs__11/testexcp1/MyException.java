package oop.Labs__11.testexcp1;

public class MyException extends Exception {

    private String someString;

    public MyException(String someString) {
        this.someString = someString;
    }

    public void printSomeText() {
        System.out.println(someString);
    }
}
