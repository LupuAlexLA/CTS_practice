package _99_My_Examples._03_comportamentale._04_Memento._02_Document;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.typeText("Hai sa dam");
        textEditor.save();

        textEditor.typeText(" mana cu mana ");
        textEditor.save();

        textEditor.typeText("cei cu inima romana");
        textEditor.toString();

        textEditor.undo();
        textEditor.toString();

        textEditor.undo();
        textEditor.toString();
    }
}
