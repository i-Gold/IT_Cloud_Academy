package oop.Labs__17.Lab_5;

public class Counter implements Runnable{

    private Storage storage;
    private int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < storage.getSomeInt(); i++) {
            counter++;
        }
    }
}
