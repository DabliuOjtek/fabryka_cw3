public class TagStrong extends AbstractTagFactory {
    public TagStrong(String text) {
        this.text=text;
    }

    @Override
    public void write() {
        System.out.print("<strong> "+text+" </strong>");
    }
}
