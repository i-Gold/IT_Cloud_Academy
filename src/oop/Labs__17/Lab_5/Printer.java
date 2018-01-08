package oop.Labs__17.Lab_5;

public class Printer implements Runnable {

    private Storage storage;

    @Override
    public void run() {
        System.out.println(storage.getSomeInt());
    }
}
