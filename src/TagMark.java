public class TagMark extends AbstractTagFactory {
    public TagMark(String text) {
        this.text=text;
    }
    @Override
    public void write() {
        System.out.print("<mark> "+text+" </mark>");
    }
}
