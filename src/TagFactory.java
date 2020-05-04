public class TagFactory {
    public AbstractTagFactory write (ConfigTag cfg){
        String text = cfg.setText();
        int choice = cfg.getChoice();
        switch (choice){
            case 1:
                return new TagP(text);
            case 2:
                return new TagStrong(text);
            case 3:
                return new TagEm(text);
            case 4:
                return new TagMark(text);
        }
        return null;
    }
}
