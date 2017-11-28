package oop.Labs__11.testexcp1;

public class Main {
    public static void main(String[] args) {

//        try {
//            throw new Exception("Try this code");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("I was in finally block");
//        }

        MyTest test1 = new MyTest();
        try {
            test1.test();
        } catch (MyException me) {
            me.printSomeText();
        }
        System.out.println();

        MyTest test2 = null;
        try {
            test2.test();
        } catch (MyException me) {
            me.printSomeText();
        } catch (NullPointerException npe) {
            System.out.println("Found: " + npe.toString());
        }
    }
}
