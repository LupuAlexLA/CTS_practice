package _00_ChatGPT_sameProblems._04_Prototype;

import java.util.ArrayList;
import java.util.List;

public class GameStream implements Stream, Cloneable {
    private String title;
    private byte[] stream;
    private List<String> comments;

    public GameStream(String title, byte[] stream) {
        this.title = title;
        this.stream = new byte[] {1, 2, 3};
        this.comments = new ArrayList<>();
    }

    @Override
    public String getMatchTitle() {
        return title;
    }

    @Override
    public void setMatchTitle(String title) {
        this.title = title;
    }

    @Override
    public byte[] getVideoStream() {
        return stream.clone();
    }

    @Override
    public List<String> getChatMessages() {
        return new ArrayList<>(comments);
    }

    @Override
    public void addChatMessage(String message) {
        comments.add(message);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        GameStream copy = (GameStream) super.clone();
        copy.title = title;
        copy.stream = stream;
        copy.comments = new ArrayList<>(this.comments);
        return copy;
    }
}
