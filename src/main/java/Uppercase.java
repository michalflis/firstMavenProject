public class Uppercase implements TextFormatter {

    String text;

    public Uppercase (String text) {
        this.text = text;
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
