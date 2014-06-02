public class TextWriter {
    private String textToDisplay;

    public TextWriter() {
        textToDisplay = "";
    }

    public TextWriter(String inputText) {
        textToDisplay = inputText;
    }

    public void setTextToDisplay(String inputText) {
        textToDisplay = inputText;
    }
    
    public void setClearTextToDisplay() {
        textToDisplay = "";
    }

    public String getTextToDisplay() {
        return textToDisplay;
    }

    public void display() {
        System.out.println(textToDisplay);
    }
}