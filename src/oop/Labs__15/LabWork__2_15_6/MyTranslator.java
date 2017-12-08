package oop.Labs__15.LabWork__2_15_6;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {

    private Map<String, String> dictionary = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyTranslator that = (MyTranslator) o;

        return dictionary != null ? dictionary.equals(that.dictionary) : that.dictionary == null;
    }

    @Override
    public int hashCode() {
        return dictionary != null ? dictionary.hashCode() : 0;
    }

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        return dictionary.get(en);
    }
}
