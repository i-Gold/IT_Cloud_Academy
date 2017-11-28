package oop.Labs__11.LabWork__2_11_3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        try {
            person.setAge(130);
        } catch (InvalidAgeException ie) {
//            ie.printStackTrace();
        }
    }
}
