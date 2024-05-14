package _99_My_Examples._03_comportamentale._04_Memento;

public class Ide {
    private Vcs vcsHistory = new Vcs();
    private File file = new File();

    public Ide() {
        file.setCode("");
    }

    public void save() {
        vcsHistory.addToGitHistory(file);
    }

    public void undo() {
        file = vcsHistory.getLatestFile();
    }

    public void typeCode(String code) {
        file.appendCode(code);
    }

    @Override
    public String toString() {
        return file.getCode();
    }
}
