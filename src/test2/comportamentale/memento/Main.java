package test2.comportamentale.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.typeText("apa trece");
        textEditor.save();

        textEditor.typeText(",");
        textEditor.save();

        textEditor.typeText("pietrele raman");
        System.out.println(textEditor);

        textEditor.undo();
        System.out.println(textEditor);

        textEditor.undo();
        System.out.println(textEditor);
    }
}
