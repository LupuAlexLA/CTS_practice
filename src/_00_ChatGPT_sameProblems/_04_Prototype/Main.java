package _00_ChatGPT_sameProblems._04_Prototype;

public class Main {
    public static void main(String[] args) {
        byte[] streamData = new byte[] {1, 2, 3};
        GameStream original = new GameStream("Forza Horizon", streamData);

        try {
            GameStream twitch = (GameStream) original.clone();
            GameStream youtube = (GameStream) original.clone();
            GameStream tiktok = (GameStream) original.clone();

            twitch.addChatMessage("hello");
            youtube.addChatMessage("hi guys");
            tiktok.addChatMessage("hola");

            System.out.println("Twitch: " + twitch.getChatMessages());
            System.out.println("Youtube: " + youtube.getChatMessages());
            System.out.println("Tiktok: " + tiktok.getChatMessages());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
