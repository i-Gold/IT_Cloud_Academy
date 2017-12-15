package oop.Labs__17.LabWork__1_and_2;

public class MyTimeBomb implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
