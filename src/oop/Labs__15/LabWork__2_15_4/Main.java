package oop.Labs__15.LabWork__2_15_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        final int SIZE_OF_LIST = 10;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < SIZE_OF_LIST; i++) {
            arrayList.add("num_" + i);
            linkedList.add("num_" + i);
        }
        System.out.println("ArrayList was created");
        System.out.println("LinkedList was created" + "\n");

        Iterator<String> iterator;

        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();    // We can print it, but not now
        }

        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();    // We can print it, but not now
        }

        ListIterator<String> linkedListIterator = linkedList.listIterator();
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            linkedListIterator.add(iterator.next()); // Add new elements to LinkedList
        }

        ListIterator<String> arrayListIterator = arrayList.listIterator();
        while (linkedListIterator.hasPrevious()) {
            arrayListIterator.add(linkedListIterator.previous());   // Add new elements in reverse order
        }                                                           // to the new Array List Iterator

        System.out.println("ArrayList:");
        printElements(arrayList);
        System.out.println("\n");

        System.out.println("LinkedList:");
        printElements(linkedList);
    }

    public static void printElements(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
