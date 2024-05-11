package test2.memento;
// orchestratorul (editorul de text)
public class TextEditor {
    private HistoryManager historyManager = new HistoryManager(); // va fi unul singur
    private TextDocument textDocument = new TextDocument();

    public TextEditor() {
        textDocument.setText(""); // la creare sa fie textul gol
    }

    // va salva versiunea curenta de document in istoric
    public void save() {
        historyManager.addToHistory(textDocument);
    }

    public void undo() {
        textDocument = historyManager.getLatest();
    }

    public void typeText(String text) {
        textDocument.appendText(text); // adauga textul in document (prin editor)
    }

    @Override
    public String toString() {
        return textDocument.getText();
    }
}
