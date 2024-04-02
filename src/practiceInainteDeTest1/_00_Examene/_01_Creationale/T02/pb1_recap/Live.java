package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb1_recap;

import java.util.List;

public interface Live {
    String getTitle();
    void setTitle();
    byte[] getStream();
    List<String> getComments();
    void addComment(String comment);
}
