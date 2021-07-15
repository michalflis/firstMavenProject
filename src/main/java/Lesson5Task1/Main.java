package Lesson5Task1;

public class Main {

    public static void main (String[] args) {

        TextChecker textChecker = new TextChecker("kajak");

        System.out.println(textChecker.checkIfGivenTextContainsChars());
        if (textChecker.checkIfGivenTextContainsChars()) {
            System.out.println(textChecker.checkIfGivenTextIsPalindrome());
            System.out.println(textChecker.getGivenTextLength());

        }

    }

}
