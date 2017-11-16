package OOP_projects;
import java.util.Scanner;

public class LabWork__2_4_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time of a falling meteor: ");
        double time = scanner.nextDouble();

        System.out.print("The distance is: ");
        GravityCalculator.printDistance(time);
    }
}

class GravityCalculator {

    private static final double ACCELERATION = -9.81;
    private static double velocity = 0;
    private static double position = 0;

    public static double calculateDistance(double time){
        return  0.5 * ACCELERATION * (time * time) + velocity * time + position;    // position * t
    }

    public static void printDistance(double time){
        System.out.println(GravityCalculator.calculateDistance(time));
    }
}