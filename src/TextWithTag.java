public class TextWithTag {
    ConfigTag cfg = new ConfigTag();
    public void createTaggedText() {
        TagFactory tagFactory = new TagFactory();
        AbstractTagFactory base = tagFactory.write(cfg);
        base.write();
    }
}
