package oop.Labs__15.LabWork__2_15_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            result.add(random.nextInt(maxNumb));
        }
        return result;
    }
}
