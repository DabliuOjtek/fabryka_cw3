public class TagEm extends AbstractTagFactory {
    public TagEm(String text) {
        this.text=text;
    }
    @Override
    public void write() {
        System.out.print("<em> "+text+" </em>");
    }
}
