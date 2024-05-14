package _99_My_Examples._03_comportamentale._04_Memento._02_Document;

import java.util.ArrayList;
import java.util.List;

public class HistoryManager {
    private List<TextDocument> history = new ArrayList<>();

    public void addToHistory(TextDocument textDocument) {
        try {
            history.add((TextDocument) textDocument.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public TextDocument getLatest() {
        if(!history.isEmpty()) {
            TextDocument textDocument = history.get(history.size() - 1);
            history.remove(textDocument);
            return textDocument;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
