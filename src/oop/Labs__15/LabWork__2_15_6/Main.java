package oop.Labs__15.LabWork__2_15_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyTranslator translator = new MyTranslator();

        translator.addNewWord("cat", "кот");
        translator.addNewWord("caught", "поймал");
        translator.addNewWord("mouse", "мышь");

        System.out.print("Enter phrase in English: ");
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        System.out.print("Translation in Russian: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(translator.translate(input[i]) + " ");
        }
    }
}
