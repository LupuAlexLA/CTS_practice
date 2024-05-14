package _99_My_Examples._03_comportamentale._04_Memento._02_Document;

public class TextDocument implements Cloneable {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void appendText(String text) {
        this.text = this.text + text;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        TextDocument copy = (TextDocument) super.clone();
        copy.text = text;
        return copy;
    }
}
