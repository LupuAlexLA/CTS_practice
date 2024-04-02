package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb1_prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        byte[] streamData = new byte[] {1, 2, 3};
        LiveBroadcast originalBroadcast = new LiveBroadcast("Eveniment Live", streamData);

        LiveBroadcast facebookLive = originalBroadcast.clone();
        LiveBroadcast youtubeLive = originalBroadcast.clone();
        LiveBroadcast twitterLive = originalBroadcast.clone();

        facebookLive.addComment("Super eveniment!");
        youtubeLive.addComment("Uimitor!");
        twitterLive.addComment("Foarte interesant!");

        // comentariile sunt unice pentru fiecare
        System.out.println("Comentarii Facebook Live: " + facebookLive.getComments());
        System.out.println("Comentarii YouTube Live: " + youtubeLive.getComments());
        System.out.println("Comentarii Twitter Live: " + twitterLive.getComments());
    }
}
