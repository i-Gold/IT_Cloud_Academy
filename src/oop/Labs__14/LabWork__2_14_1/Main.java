package oop.Labs__14.LabWork__2_14_1;

public class Main {
    public static void main(String[] args) {

        MyTuple<String, Integer, Long> firstObj = new MyTuple<>("ASUS", 23, 21443553L);
        MyTuple<Double, String, String> secondObj = new MyTuple<>(21.5, "DELL", "e1pl5pls");

        System.out.println(firstObj.getA() + " " + firstObj.getB() + " " + firstObj.getC() + "\n"
                         + secondObj.getA() + " " + secondObj.getB() + " " + secondObj.getC());
    }
}
