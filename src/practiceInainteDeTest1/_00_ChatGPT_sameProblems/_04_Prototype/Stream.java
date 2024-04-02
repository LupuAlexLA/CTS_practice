package practiceInainteDeTest1._00_ChatGPT_sameProblems._04_Prototype;

import java.util.List;

public interface Stream {
    String getMatchTitle();
    void setMatchTitle(String title);
    byte[] getVideoStream();
    List<String> getChatMessages();
    void addChatMessage(String message);
}
