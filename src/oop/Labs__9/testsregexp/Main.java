package oop.Labs__9.testsregexp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String name : names) {
            System.out.println(name + " — " + checkPersonWithRegExp(name));
        }
    }

    public static Boolean checkPersonWithRegExp(String userNameString) {
        String temp = userNameString;
        String template = "^[A-Z]{1}[a-z]*";
        Pattern p = Pattern.compile(template);
        Matcher m = p.matcher(temp);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
