package _99_My_Examples._03_comportamentale._04_Memento._02_Document;

public class TextEditor {
    private HistoryManager historyManager = new HistoryManager();
    private TextDocument textDocument = new TextDocument();

    public TextEditor() {
        textDocument.setText("");
    }

    public void save() {
        historyManager.addToHistory(textDocument);
    }

    public void undo() {
        textDocument = historyManager.getLatest();
    }

    public void typeText(String text) {
        textDocument.appendText(text);
    }

    @Override
    public String toString() {
        return textDocument.getText();
    }
}
