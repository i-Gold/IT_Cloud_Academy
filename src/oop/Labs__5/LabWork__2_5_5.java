package oop.Labs__5;

import java.util.Random;

public class LabWork__2_5_5 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            InitTest init = new InitTest();
            System.out.println(init.getId());
        }
    }
}

class InitTest {

    private int id;
    private static int nextId;

    static {
        Random random = new Random();
        nextId = random.nextInt(1000 + 1);
    }
    {
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }
}