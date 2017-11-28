package oop.Labs__9.teststring2;

public class Main {
    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.println(myStr1 + " — " + myStr1.contains("Cartoon") + "\n"
                         + myStr2 + " — " + myStr2.contains("Cartoon") + "\n");
        // or ??
        System.out.println("Result of equals: " + myStr1.equals(myStr2));
    }
}
