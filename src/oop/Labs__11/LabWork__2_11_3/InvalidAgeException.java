package oop.Labs__11.LabWork__2_11_3;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        System.out.println("Invalid age! Try again");
    }
}
