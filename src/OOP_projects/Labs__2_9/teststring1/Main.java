package OOP_projects.Labs__2_9.teststring1;


public class Main {
    public static void main(String[] args) {

        String myStr = "abracadabra";
        System.out.println("Text: " + myStr + "\n"
                         + "- from the beginning in index №" + myStr.indexOf("ra") + "\n"
                         + "- from the eng in index №" + myStr.lastIndexOf("ra") + "\n"
                         + "- text from 3-rd index to 7-th: " + myStr.substring(3,7) + "\n"
                         + "Reversed text: " + reverseString(myStr));
    }

    public static String reverseString(String input) {
        String temp = input;
        StringBuilder result = new StringBuilder(temp);
        return result.reverse().toString();
    }
}
