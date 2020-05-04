public class TagP extends AbstractTagFactory {
    public TagP(String text) {
        this.text=text;
    }
    @Override
    public void write() {
        System.out.print("<p> "+text+" </p>");
    }
}
