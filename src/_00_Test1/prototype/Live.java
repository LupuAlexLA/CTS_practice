package _00_Test1.prototype;

import java.util.List;

public interface Live {
    String getTitle();
    void setTitle();
    byte[] getStream();
    List<String> getComments();
    void addComment(String comment);
}