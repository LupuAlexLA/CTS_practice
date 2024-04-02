package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb1_prototype;

import java.util.ArrayList;
import java.util.List;

public class LiveBroadcast implements Live, Cloneable {
    private String title;
    private byte[] stream;
    private List<String> comments;

    public LiveBroadcast(String title, byte[] stream) {
        this.title = title;
        this.stream = stream;
        this.comments = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle() {
        this.title = title;
    }

    @Override
    public byte[] getStream() {
        return stream.clone(); // asiguram că stream-ul este clonat pentru a preveni leaks-urile de referințe
    }

    @Override
    public List<String> getComments() {
        return new ArrayList<>(comments); // returnam o copie a listei pentru a preveni modificarile externe
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public LiveBroadcast clone() throws CloneNotSupportedException {
        LiveBroadcast copy = (LiveBroadcast) super.clone();
        copy.title = title;
        copy.stream = stream;
        copy.comments = new ArrayList<>(this.comments);
        return copy;
    }
}