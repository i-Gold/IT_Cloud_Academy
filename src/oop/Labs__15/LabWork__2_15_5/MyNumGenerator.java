package oop.Labs__15.LabWork__2_15_5;

import java.util.*;

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

    public Set<Integer> generateDistinct() {
        Random random = new Random();
        Set<Integer> result = new HashSet<>();
        while (result.size() < numOfElm) {
            result.add(random.nextInt(maxNumb));
        }
        return result;
    }
}
