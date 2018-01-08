package oop.Labs__17.Lab_5;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        Counter counter = new Counter();
        Printer printer = new Printer();

        storage.setSomeInt(5);
        counter.run();
        printer.run();
    }
}
