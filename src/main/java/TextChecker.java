public class TextChecker {

    private String givenText;

    public TextChecker (String givenText) {
        this.givenText = givenText;
    }

    boolean checkIfGivenTextContainsChars() {
        return ! givenText.isBlank();
    }

     private String reverseGivenText() {
        String reversedGivenText = "";
        for (int i = givenText.length() - 1; i >= 0; i--)
            reversedGivenText = reversedGivenText + givenText.charAt(i);
        return reversedGivenText;
    }

    boolean checkIfGivenTextIsPalindrome() {
        return givenText.equals(reverseGivenText());
    }

    int getGivenTextLength() {
        return givenText.length();
    }

}
