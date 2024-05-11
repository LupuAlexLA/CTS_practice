package test2.memento;
// asta e memento efectiv
// pt ca eu am o lista de obiecte (cu acelasi obiect) eu daca modific obiectul curent se modifica toate
// din acest motiv trebuie sa facem un deep copy
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
