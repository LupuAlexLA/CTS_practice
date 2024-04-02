package lastShot.prototype;

import java.util.ArrayList;
import java.util.List;

public class Broadcast implements Live, Cloneable {
    private String title;
    private byte[] stream;
    private List<String> comments;

    public Broadcast(String title, byte[] stream) {
        System.out.println("The live is streaming...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
        title = null;
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
        Broadcast copy = (Broadcast) super.clone();
        copy.title = title;
        copy.stream = stream;
        copy.comments = new ArrayList<>(this.comments);
        return copy;
    }
}
