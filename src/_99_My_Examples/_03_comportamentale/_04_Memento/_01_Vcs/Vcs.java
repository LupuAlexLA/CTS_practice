package _99_My_Examples._03_comportamentale._04_Memento._01_Vcs;

import java.util.ArrayList;
import java.util.List;

public class Vcs {
    public List<File> history = new ArrayList<>();

    public void addToGitHistory(File file) {
        try {
            history.add((File) file.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public File getLatestFile() {
        if(!history.isEmpty()) {
            File file = history.get(history.size() - 1);
            history.remove(file);
            return file;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
