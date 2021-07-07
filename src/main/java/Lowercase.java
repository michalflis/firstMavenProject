public class Lowercase implements TextFormatter{

    String text;

    public Lowercase (String text) {
        this.text = text;
    }

    @Override
    public String formatText(String text) {
    return text.toLowerCase();
    }

}
