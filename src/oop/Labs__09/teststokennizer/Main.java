package oop.Labs__09.teststokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String myStr = "This is String, split by StringTokenizer. Created by Student: Richard";
        StringTokenizer sk = new StringTokenizer(myStr, ",.");
        while (sk.hasMoreElements()) {
            System.out.println(sk.nextElement().toString().trim());
        }
    }
}
