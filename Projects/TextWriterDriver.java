public class TextWriterDriver {
    public static void main(String[] args) {
        TextWriter tw1;
        tw1 = new TextWriter();
        tw1.setTextToDisplay("This line is from my first Java object!");
        tw1.display();
        TextWriter tw2 = new TextWriter("And this line is from my second object.");
        System.out.println(tw2.getTextToDisplay());
        TextWriter tw3 = new TextWriter("My 3rd line");
        System.out.println(tw3.getTextToDisplay());
        tw3.setClearTextToDisplay();
        System.out.println(tw3.getTextToDisplay());
        System.out.println("Hopefully there is a blank line above me");
    }
}