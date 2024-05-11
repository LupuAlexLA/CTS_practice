package test2.memento;

import java.util.ArrayList;
import java.util.List;

// manager de stari
public class HistoryManager {
    private List<TextDocument> history = new ArrayList<>();

    public void addToHistory(TextDocument textDocument) {
        try {
            history.add((TextDocument) textDocument.clone()); //history.add(textDocument); -> nu asa ca e o copie
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public TextDocument getLatest() {
        if(!history.isEmpty()) {
            TextDocument textDocument = history.get(history.size() - 1); // il iau din lista
            history.remove(textDocument); // il sterg din lista
            return textDocument; // il returnez
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
