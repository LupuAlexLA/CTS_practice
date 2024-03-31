package _00_Examene._01_Creationale.T02.pb1_recap;

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
        return stream.clone();
    }

    @Override
    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        LiveBroadcast copy = (LiveBroadcast) super.clone();
        copy.title = title;
        copy.stream = stream;
        copy.comments = new ArrayList<>(this.comments);
        return copy;
    }
}
